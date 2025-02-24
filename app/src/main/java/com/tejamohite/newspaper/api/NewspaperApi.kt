package com.tejamohite.newspaper.api

import com.tejamohite.newspaper.model.NewspaperResponse
import retrofit2.http.GET

interface NewspaperApi {
    @GET("newspapers.json")
    suspend fun getNewspapers(): NewspaperResponse
}