package com.gauravk.bubblebarsample.adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter



/**
 * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
 * sequence.
 */
class ScreenSlidePagerAdapter( private val fragmentList: ArrayList<Fragment>, fm: FragmentManager) : FragmentStatePagerAdapter(fm)
{

    override fun getCount(): Int = fragmentList.size

    override fun getItem(position: Int): Fragment {
        if (position == 0 && position < fragmentList.size)
            return fragmentList[position]
        else if (position == 1 && position < fragmentList.size)
            return fragmentList[position]
        else if (position == 2 && position < fragmentList.size)
            return fragmentList[position]
        else if (position == 3 && position < fragmentList.size)
            return fragmentList[position]
        else(position == 4 && position < fragmentList.size)
            return fragmentList[position]


    }
}