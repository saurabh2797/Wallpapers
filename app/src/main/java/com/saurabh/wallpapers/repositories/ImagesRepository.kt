package com.saurabh.wallpapers.repositories

import com.saurabh.wallpapers.api.ImageAPI

class ImagesRepository(
private val api : ImageAPI
) {

suspend fun getALlImages() = api.getAllImages() //for all wallpapers

}