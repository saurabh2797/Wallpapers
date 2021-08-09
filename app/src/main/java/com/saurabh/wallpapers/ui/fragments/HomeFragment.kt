package com.saurabh.wallpapers.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.saurabh.wallpapers.MainActivity
import com.saurabh.wallpapers.R
import com.saurabh.wallpapers.databinding.FragmentHomeBinding
import com.saurabh.wallpapers.ui.adapters.ImagesAdapter
import com.saurabh.wallpapers.viewModels.ImagesViewModel


class HomeFragment : Fragment(R.layout.fragment_home) {

    lateinit var binding: FragmentHomeBinding
    lateinit var viewModel: ImagesViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
        viewModel = (activity as MainActivity).viewModel

        viewModel.image.observe(viewLifecycleOwner, {
            binding.rvImages.adapter = ImagesAdapter(it)
            binding.rvImages.layoutManager = LinearLayoutManager(requireContext())
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


}