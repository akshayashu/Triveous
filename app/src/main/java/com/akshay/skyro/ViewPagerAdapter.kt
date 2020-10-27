package com.akshay.skyro

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager, private val news: ArrayList<NewsData>): FragmentStatePagerAdapter(fragmentManager) {
    override fun getCount(): Int {
        return 10
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "bbc news$position"
    }

    override fun getItem(position: Int): Fragment {
        Log.d("TAB NO", position.toString())
        when(position){
            0 -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            1 -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            2 -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            3 -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            4 -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            5 ->{
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            6 -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            7 -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            8 -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
            else -> {
                val list: ArrayList<NewsData> = ArrayList()
                news.forEach {
                    if (it.cat == "bbc$position"){
                        list.add(it)
                    }
                }
                return NewsCategoryFragment.newInstance(list)
            }
        }

    }
}