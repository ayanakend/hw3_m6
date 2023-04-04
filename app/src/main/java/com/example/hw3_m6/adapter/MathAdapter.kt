package com.example.hw3_m6.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hw3_m6.math.PointFragment
import com.example.hw3_m6.math.ViewHistoryFragment
import com.example.hw3_m6.math.ViewPointFragment

class MathAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity){
    private val point = 3
    override fun getItemCount(): Int {
        return point
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> {
                PointFragment()
            }
            1-> {
                ViewPointFragment()
            }
            2-> {
                ViewHistoryFragment()
            }
            else -> {PointFragment()}
        }
    }


}