package com.example.lesson43f.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lesson43f.ui.fragments.onboard.OnBoardPageFirst
import com.example.lesson43f.ui.fragments.onboard.OnBoardPageSecond
import com.example.lesson43f.ui.fragments.onboard.OnBoardPageThird

class OnBoardAdapter(private val fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> OnBoardPageFirst()
            1 -> OnBoardPageSecond()
            else -> OnBoardPageThird()
        }
    }
}