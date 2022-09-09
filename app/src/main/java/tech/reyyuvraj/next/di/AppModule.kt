package tech.reyyuvraj.next.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import tech.reyyuvraj.next.common.Constants.BASE_URL
import tech.reyyuvraj.next.data.remote.TmdbApi
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): TmdbApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(TmdbApi::class.java)
    }

    /*@Provides
    @Singleton
    fun provideCoinRepository(api: TmdbApi): TmdbRepository {
        return TmdbRepositoryImpl(api)
    }*/
}