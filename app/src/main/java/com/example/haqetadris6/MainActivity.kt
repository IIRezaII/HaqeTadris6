package com.example.haqetadris6

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import com.example.haqetadris8.Fragments.*

import com.gauravk.bubblebarsample.adapters.ScreenSlidePagerAdapter
import com.gauravk.bubblenavigation.BubbleNavigationLinearView
import com.gauravk.bubblenavigation.BubbleToggleView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val fragList = ArrayList<Fragment>()
        fragList.add(HomeFragment())
        fragList.add(ShareFragment())
        fragList.add(CalculateFragment())
        fragList.add(PdfFragment())
        fragList.add(CalculatorFragment())


        val pagerAdapter = ScreenSlidePagerAdapter(fragList, supportFragmentManager)
        view_pager.adapter = pagerAdapter
        view_pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {


            override fun onPageScrollStateChanged(p0: Int) {

            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {

            }

            override fun onPageSelected(p0: Int) {
                bottomNavigationViewLinear.setCurrentActiveItem(p0)
            }

        })


        bottomNavigationViewLinear.setNavigationChangeListener { _, position ->
            view_pager.setCurrentItem(position, true)
        }

        //change the initial activate element
        val newInitialPosition = 2
        bottomNavigationViewLinear.setCurrentActiveItem(newInitialPosition)
        view_pager.setCurrentItem(newInitialPosition, false)



    }



}





