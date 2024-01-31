package datasource

import api.GithubApi
import javax.inject.Inject

internal class SearchRemoteDataSourceImpl @Inject constructor(
    private val network: GithubApi,
): SearchRemoteDataSource {

}