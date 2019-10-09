package com.onion.warInstructions

import android.os.Bundle
import com.onion.warInstructions.base.BaseActivity
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : BaseActivity() {

    override fun onCreateViewId(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(toolbar)
        showToolbar(false)
    }

}
