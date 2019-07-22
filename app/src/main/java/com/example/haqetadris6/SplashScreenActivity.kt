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

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


        val background = object :Thread(){

            override fun run() {
                try {
                    Thread.sleep(5000)

                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)

                }catch (e : Exception){
                    e.printStackTrace()
                }
            }

        }

        background.start()


    }

}





