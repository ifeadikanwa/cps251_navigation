package com.ifyezedev.cps251_navigation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.ifyezedev.cps251_navigation.R
import com.ifyezedev.cps251_navigation.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.button1.setOnClickListener { view ->
            val action = MainFragmentDirections
                .actionMainFragmentToSecondFragment("Image 1", R.drawable.android_image_1)

            view.findNavController().navigate(action)
        }

        binding.button2.setOnClickListener { view ->
            val action = MainFragmentDirections
                .actionMainFragmentToSecondFragment("Image 2", R.drawable.android_image_2)

            view.findNavController().navigate(action)
        }

        binding.button3.setOnClickListener { view ->
            val action = MainFragmentDirections
                .actionMainFragmentToSecondFragment("Image 3", R.drawable.android_image_3)

            view.findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}