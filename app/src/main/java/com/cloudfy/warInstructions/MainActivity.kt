package com.cloudfy.warInstructions

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.cloudfy.warInstructions.base.BaseActivity
import com.cloudfy.warInstructions.entities.Chapter
import kotlinx.android.synthetic.main.activity_main.*

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
