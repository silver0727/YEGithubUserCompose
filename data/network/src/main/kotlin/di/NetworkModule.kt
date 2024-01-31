package di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import datasource.SearchRemoteDataSource
import datasource.SearchRemoteDataSourceImpl

@Module
@InstallIn(SingletonComponent::class)
internal abstract class NetworkModule {

    @Binds
    abstract fun bindsSearchRemoteDataSource(impl: SearchRemoteDataSourceImpl): SearchRemoteDataSource
}