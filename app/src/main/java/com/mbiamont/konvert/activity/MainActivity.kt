package com.mbiamont.konvert.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mbiamont.konvert.R
import com.mbiamont.konvert.adapter.TabFragmentAdapter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by Sandeep Singh
 *
 * Main activity
 */
class MainActivity : AppCompatActivity() {

    private lateinit var tabFragmentAdapter: TabFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tabFragmentAdapter = TabFragmentAdapter(this, supportFragmentManager)

        initView()
    }

    /**
     * Setup the view
     */
    private fun initView() {
        mainViewPager.adapter = tabFragmentAdapter
        tabLayout.setupWithViewPager(mainViewPager)
        mainViewPager.currentItem = 1
    }
}
