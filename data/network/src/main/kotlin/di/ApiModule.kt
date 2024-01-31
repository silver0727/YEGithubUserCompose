package di

import api.GithubApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
internal object ApiModule {

    @Provides
    fun providesOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(
                HttpLoggingInterceptor().apply {
                    setLevel(
                        level = HttpLoggingInterceptor.Level.BODY,
                    )
                }
            )
            .build()
    }

    @Provides
    fun providesRetrofit(
        okHttpClient: OkHttpClient,
    ): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient)
            .baseUrl("https://api.github.com/")
            .build()
    }

    @Provides
    fun providesGithubApi(
        retrofit: Retrofit,
    ): GithubApi {
        return retrofit.create(GithubApi::class.java)
    }

}