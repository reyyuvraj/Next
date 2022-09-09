package tech.reyyuvraj.next.data.remote

import retrofit2.http.GET

interface TmdbApi {

    @GET("/movie/popular")
    suspend fun getMoviePopular()

    @GET("/tv/popular")
    suspend fun getTvPopular()
}