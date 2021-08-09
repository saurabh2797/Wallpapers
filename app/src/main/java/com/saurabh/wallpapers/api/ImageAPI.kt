package com.saurabh.wallpapers.api

import com.saurabh.wallpapers.Constants.API_KEY
import com.saurabh.wallpapers.models.WallpaperResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageAPI {

    @GET("photos/")
    suspend fun getAllImages(
        @Query("client_id")
        client_id : String = API_KEY
    ):WallpaperResponse

}