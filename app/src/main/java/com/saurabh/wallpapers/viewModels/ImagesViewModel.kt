package com.saurabh.wallpapers.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saurabh.wallpapers.models.WallpaperResponseItem
import com.saurabh.wallpapers.repositories.ImagesRepository
import kotlinx.coroutines.launch

class ImagesViewModel(
private val repository: ImagesRepository
):ViewModel() {

    val image:MutableLiveData<ArrayList<WallpaperResponseItem>> = MutableLiveData()

fun getAllImages() = viewModelScope.launch {
    val response = repository.getALlImages()
    image.postValue(response)
}

}