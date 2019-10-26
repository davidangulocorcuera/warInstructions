package com.cloudfy.warInstructions.utils




import android.view.View



class Extensions {
}

fun View.setVisible(show: Boolean, invisible: Boolean = false) {
    when {
        show -> this.visibility = View.VISIBLE
        invisible -> this.visibility = View.INVISIBLE
        else -> this.visibility = View.GONE
    }
}

fun View.isVisible(): Boolean {
    when {
        this.visibility == View.VISIBLE -> return true
        this.visibility == View.INVISIBLE -> return false
        this.visibility == View.GONE -> return false
    }
    return false
}








