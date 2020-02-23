package com.github.eliaseraphim.ligeia

import android.app.Activity
import android.content.ClipData
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.IdRes
import com.github.eliaseraphim.ligeia.ui.main.SectionsPagerAdapter


class MainActivity : AppCompatActivity(), View.OnClickListener,
    TabLayout.BaseOnTabSelectedListener<TabLayout.Tab> {

    //  Settings/Information Bar
    private lateinit var btnSettings: ImageButton
    private lateinit var textCurrentTab: TextView

    //  Tab Layout
    private lateinit var tabs: TabLayout

    //  View Page
    private lateinit var sectionsPagerAdapter: SectionsPagerAdapter
    private lateinit var viewMain: ViewPager

    //  Current Song Bar
    private lateinit var imgAC: ImageView
    private lateinit var textCurrentSong: TextView
    private lateinit var btnQueue: ImageButton

    //  Bottom Control Bar
    //      Buttons
    private lateinit var btnShuffle: ImageButton
    private lateinit var btnRewind: ImageButton
    private lateinit var btnPlayPause: ImageButton
    private lateinit var btnFastForward: ImageButton
    private lateinit var btnRepeat: ImageButton


    /*
    *   function: onCreate
    *   description: primary creation function required for android applications
    *       - Handles setting up the main activity, main frame layout, and listeners for buttons
    *   date: 02/18/20
    *       - Added function header to current setup.
    */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
            Load Order
                Main Viewport
                Bottom Control Bar
                Tab Layout
                Setting and Information Bar
                Current Song Bar
         */

        sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        initializeUI()
    }


    /*  function: initializeUI
    *   description: initializes the main activity UI
    *       - initializes the main viewport, and sets the adapter
    *       - creates listeners for all main activity buttons
    *       - creates listeners for tabs
    *   date: 02/18/19
    *       - added function header
    */
    private fun initializeUI() {
        initializeMainViewport()
        initializeBotttomControlBar()
        initializeTabLayout()
    }


    /*  function: initializeMainViewport
    *   description: initializes the main activity UI
    *       - initializes the main viewport, and sets the adapter
    *       - creates listeners for all main activity buttons
    *       - creates listeners for tabs
    *   date: 02/18/19
    *       - added function header
    */
    private fun initializeMainViewport() {
        viewMain = findViewById(R.id.view_main)
        viewMain.adapter = sectionsPagerAdapter
    }

    //  Initialization Functions
    private fun initializeBotttomControlBar() {
        //  attach variables to buttons
        ibcbAttachIDs()
        // initialize listeners
        ibcbSetListeners()
    }

    private fun ibcbAttachIDs() {
        btnShuffle = findViewById(R.id.btn_shuffle)
        btnRewind = findViewById(R.id.btn_rewind)
        btnPlayPause = findViewById(R.id.btn_play_pause)
        btnFastForward = findViewById(R.id.btn_fast_forward)
        btnRepeat = findViewById(R.id.btn_repeat)
    }

    private fun ibcbSetListeners() {
        btnShuffle.setOnClickListener(this)
        btnRewind.setOnClickListener(this)
        btnPlayPause.setOnClickListener(this)
        btnFastForward.setOnClickListener(this)
        btnRepeat.setOnClickListener(this)
    }

    private fun initializeTabLayout() {
        itlTabsSetup()
        itlSetListener()
    }


    private fun itlTabsSetup() {
        tabs = findViewById(R.id.playlist_selector_tabs)
        tabs.setupWithViewPager(viewMain)
    }

    private fun itlSetListener() {
        tabs.addOnTabSelectedListener(this)
    }

    // onClick
    override fun onClick(p0: View?) {
        when {

        }
    }

    override fun onTabSelected(p0: TabLayout.Tab) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTabReselected(p0: TabLayout.Tab?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}