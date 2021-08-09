package com.saurabh.wallpapers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.saurabh.wallpapers.api.RetrofitInstance
import com.saurabh.wallpapers.databinding.ActivityMainBinding
import com.saurabh.wallpapers.repositories.ImagesRepository
import com.saurabh.wallpapers.viewModels.ImagesViewModel
import com.saurabh.wallpapers.viewModels.ImagesViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: ImagesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = ImagesRepository(RetrofitInstance.api)
        val providerFactory = ImagesViewModelProviderFactory(repository)
        viewModel = ViewModelProvider(this, providerFactory).get(ImagesViewModel::class.java)


    }
}