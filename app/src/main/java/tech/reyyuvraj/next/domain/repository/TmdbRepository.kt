package tech.reyyuvraj.next.domain.repository

interface TmdbRepository {

    suspend fun getMoviePopular()

    suspend fun getTvPopular()
}