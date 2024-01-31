package com.silver0727.yeguc.data.search.repository

import datasource.SearchRemoteDataSource
import javax.inject.Inject

internal class SearchRepositoryImpl @Inject constructor(
    private val searchRemoteDataSource: SearchRemoteDataSource,
): SearchRepository {

}