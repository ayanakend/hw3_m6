package com.example.hw3_m6.math

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.hw3_m6.databinding.FragmentViewPointBinding
import com.example.hw3_m6.viewmodel.MathViewModel

class ViewPointFragment : Fragment() {
    lateinit var binding: FragmentViewPointBinding
    lateinit var  viewModel: MathViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewPointBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MathViewModel::class.java]
        initView()
    }

    private fun initView() {
        viewModel.pointsLive.observe(viewLifecycleOwner) {
            binding.pointTv.text = it.toString()
        }
    }

}