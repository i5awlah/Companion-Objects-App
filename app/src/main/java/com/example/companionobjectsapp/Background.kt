package com.example.companionobjectsapp

import android.view.View

// Create a class that will be responsible for changing the background of the main activity
class Background {
    // use a companion object to hold a static value of the class that indicates day or night
    companion object {
        const val day = 1
        const val night = 0
    }
    fun changeBackground(view: View, state: Int) {
        when (state) {
            1 -> view.setBackgroundResource(R.drawable.bg_day)
            0 -> view.setBackgroundResource(R.drawable.bg_night)
        }
    }
}