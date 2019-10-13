package com.onion.warInstructions.base

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.onion.warInstructions.R
import com.onion.warInstructions.utils.setVisible
import kotlinx.android.synthetic.main.toolbar.*


abstract class BaseActivity : AppCompatActivity() {

    var LOG_TAG = BaseActivity::class.java.simpleName
    fun getTag(): String {
        return this.javaClass.simpleName
    }

    protected abstract fun onCreateViewId(): Int


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LOG_TAG = getTag()
        val layoutId = onCreateViewId()
        if (layoutId != 0) {
            setContentView(layoutId)
        }
    }

    fun showProgress(show: Boolean, hasShade: Boolean) {
        val progress = findViewById<ProgressBar>(R.id.progress)
        val progressContainer = findViewById<View>(R.id.progressContainer)
        progressContainer?.setVisible(show && hasShade)
        progress?.setVisible(show)
    }

    fun showToolbar(show: Boolean) {
        if (show)
            this.supportActionBar?.show()
        else {
            this.supportActionBar?.hide()
        }
    }

    fun setToolbarTitle(title: String) {
        this.supportActionBar?.title = ""
        this.toolbarTitle.text = title
    }

    fun setToolbarBackButton(show: Boolean){
        this.supportActionBar?.setDisplayHomeAsUpEnabled(show)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }



}
