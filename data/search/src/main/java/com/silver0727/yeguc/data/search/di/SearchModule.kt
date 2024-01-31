package com.silver0727.yeguc.data.search.di

import com.silver0727.yeguc.data.search.repository.SearchRepository
import com.silver0727.yeguc.data.search.repository.SearchRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class SearchModule {

    @Binds
    abstract fun bindsSearchRepository(impl: SearchRepositoryImpl): SearchRepository

}