package com.akshay.skyro

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager, private val news: ArrayList<NewsData>): FragmentStatePagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 10
    }

    override fun getItem(position: Int): Fragment {
        return NewsCategoryFragment.newInstance(news)
    }
}