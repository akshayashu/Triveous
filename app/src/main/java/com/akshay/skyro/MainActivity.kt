package com.akshay.skyro

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener

class MainActivity : AppCompatActivity() {

    lateinit var viewPager1: ViewPager
    lateinit var tabLayout: TabLayout
    lateinit var pagerAdapter: ViewPagerAdapter
    private var list: ArrayList<NewsData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager1 = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        init()
        tabInit()


        pagerAdapter = ViewPagerAdapter(supportFragmentManager, list)
        viewPager1.offscreenPageLimit = 0
        viewPager1.adapter = pagerAdapter

        viewPager1.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Log.d("CURRR POSITION", tab!!.position.toString())
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }

    private fun init(){
        for (no in 0..9) {
            list.add(NewsData("bbc$no", "Akshay$no", "Khanna"))
            list.add(NewsData("bbc$no", "Akshay$no", "Khanna"))
            list.add(NewsData("bbc$no", "Akshay$no", "Khanna"))
            list.add(NewsData("bbc$no", "Akshay$no", "Khanna"))
            list.add(NewsData("bbc$no", "Ashu$no", "Khanna"))
            list.add(NewsData("bbc$no", "Akshay$no", "Khanna"))
            list.add(NewsData("bbc$no", "Ashu$no", "Khanna"))
            list.add(NewsData("bbc$no", "Ashu$no", "Khanna"))
        }
    }

    fun tabInit(){
        tabLayout.setupWithViewPager(viewPager1)
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
    }
}