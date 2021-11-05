package com.ifyezedev.cps251_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ifyezedev.cps251_navigation.databinding.FragmentMainBinding
import com.ifyezedev.cps251_navigation.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        arguments?.let {
            val args = SecondFragmentArgs.fromBundle(it)
            binding.titleTextView.text = args.imageTitle
            binding.imageView.setImageResource(args.imageReference)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}