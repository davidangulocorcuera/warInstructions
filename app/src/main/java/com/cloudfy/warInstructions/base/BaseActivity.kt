package com.cloudfy.warInstructions.base

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import com.cloudfy.warInstructions.R
import com.cloudfy.warInstructions.utils.setVisible


abstract class BaseActivity : AppCompatActivity(), MainMVP.View {

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


    override fun hideKeyboard() {
        val view = this.currentFocus
        hideKeyboard(view)
    }

    fun hideKeyboard(view: View?) {
        if (view != null) {
            val imm = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    fun showProgress(show: Boolean, hasShade: Boolean) {
        val progress = findViewById<ProgressBar>(R.id.progress)
        val progressContainer = findViewById<View>(R.id.progressContainer)
        progressContainer?.setVisible(show && hasShade)
        progress?.setVisible(show)
    }


}
