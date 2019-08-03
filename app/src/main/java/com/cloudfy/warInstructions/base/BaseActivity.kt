package com.cloudfy.warInstructions.base

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.utils.setVisible


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


}
