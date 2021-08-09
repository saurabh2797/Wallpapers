package com.saurabh.wallpapers.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.saurabh.wallpapers.repositories.ImagesRepository

class ImagesViewModelProviderFactory(
val repository: ImagesRepository
):ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ImagesViewModel(repository) as T
    }
}