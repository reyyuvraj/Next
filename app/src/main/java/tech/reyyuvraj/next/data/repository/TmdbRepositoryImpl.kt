package tech.reyyuvraj.next.data.repository

import tech.reyyuvraj.next.data.remote.TmdbApi
import tech.reyyuvraj.next.domain.repository.TmdbRepository
import javax.inject.Inject

class TmdbRepositoryImpl @Inject constructor(
    private val api: TmdbApi
): TmdbRepository {
    override suspend fun getMoviePopular() {
        TODO("Not yet implemented")
    }

    override suspend fun getTvPopular() {
        TODO("Not yet implemented")
    }

}