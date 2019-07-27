package com.cloudfy.warInstructions.base


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment


abstract class BaseFragment : Fragment(), MainMVP.View {
    val LOG_TAG = this::class.java.simpleName



    protected abstract fun onCreateViewId(): Int
    protected abstract fun viewCreated(view: View?)

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        viewCreated(view)
    }



    fun showProgress(show: Boolean, hasShade: Boolean) {
        baseActivity?.showProgress(show, hasShade)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(onCreateViewId(), container, false)
    }

    val baseActivity: BaseActivity?
        get() {
            return activity as? BaseActivity
        }

    override fun hideKeyboard() {
        baseActivity?.hideKeyboard()
    }


    fun openKeyboard(view: View) {
        val inputMethodManager = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.toggleSoftInputFromWindow(
            view.applicationWindowToken,
            InputMethodManager.SHOW_FORCED, 0
        )
    }

}