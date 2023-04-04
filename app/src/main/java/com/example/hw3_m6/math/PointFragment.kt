package com.example.hw3_m6.math

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hw3_m6.databinding.FragmentPointBinding
import com.example.hw3_m6.viewmodel.MathViewModel

class PointFragment : Fragment() {
    private lateinit var binding: FragmentPointBinding
    private lateinit var viewModel: MathViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPointBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = ViewModelProvider(requireActivity())[MathViewModel::class.java]
        initClicker()
    }

    private fun initClicker() {
        with(binding){
            btnMinus.setOnClickListener { viewModel.minus() }
            btnPlus.setOnClickListener { viewModel.plus() }
        }
    }
}