package com.zistus.basicx.di

import android.content.Context
import androidx.room.Room
import com.zistus.basicx.BuildConfig
import com.zistus.basicx.ui.home.HomeViewModel
import com.zistus.data.datasources.api.ApiService
import com.zistus.data.datasources.api.ApiSource
import com.zistus.data.datasources.api.ApiSourceImp
import com.zistus.data.datasources.db.MyDatabase
import com.zistus.data.datasources.db.room.DatabaseSource
import com.zistus.data.datasources.db.room.DatabaseSourceImpl
import com.zistus.data.datasources.db.room.dao.BaseDao
import com.zistus.data.repository.BaseRepositoryImpl
import com.zistus.domain.usecases.BaseUseCase
import com.zistus.domain.usecases.BaseUseCaseImp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val viewModelModule = module {
    fun provideBaseUseCase(baseRepository: BaseRepositoryImpl): BaseUseCase = BaseUseCaseImp(baseRepository = baseRepository)

    single { provideBaseUseCase(get()) }
    viewModel {
        HomeViewModel(get())
    }
}

val apiModule = module {
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    single { provideApiService(get()) }
}

val retrofitModule = module {
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(BuildConfig.BUILD_TYPE)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()

    fun provideOkhttpClient(): OkHttpClient {
        val logging = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        return OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()
    }

    single { provideOkhttpClient() }
    single { provideRetrofit(get()) }
}

val roomModule = module {
    fun provideMyDatabase(context: Context) =
        Room.databaseBuilder(context, MyDatabase::class.java, "test_db")
        .fallbackToDestructiveMigration()
        .build()

    fun provideBaseDao(myDb: MyDatabase) = myDb.baseDao()
    fun provideDatabaseSource(baseDao: BaseDao): DatabaseSource = DatabaseSourceImpl(baseDao)

    single { provideBaseDao(get()) }
    single { provideDatabaseSource(get()) }
    single { provideMyDatabase(androidContext()) }
}

val repositoryModule = module {
    fun provideApiSource(apiService: ApiService): ApiSource = ApiSourceImp(apiService = apiService)

    single { provideApiSource(get()) }
    single {
        BaseRepositoryImpl(get(), get())
    }
}
