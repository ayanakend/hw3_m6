package com.example.hw3_m6.math

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hw3_m6.databinding.FragmentViewHistoryBinding
import com.example.hw3_m6.viewmodel.MathViewModel

class ViewHistoryFragment : Fragment() {
    private lateinit var binding: FragmentViewHistoryBinding
    private lateinit var  viewModel: MathViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentViewHistoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MathViewModel::class.java]
        initView()
    }

    private fun initView() {
        viewModel.historyLive.observe(viewLifecycleOwner) {
            binding.historyTv.text = it.toString()
        }
    }

}