package com.example.hw3_m6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw3_m6.adapter.MathAdapter
import com.example.hw3_m6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MathAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = MathAdapter(this)
        binding.mathVP.adapter = adapter
        binding.indicator.setViewPager(binding.mathVP)
        adapter.registerAdapterDataObserver(binding.indicator.adapterDataObserver)

    }


}