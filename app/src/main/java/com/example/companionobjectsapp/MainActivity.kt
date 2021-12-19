package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.companionobjectsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myLayout = binding.clMain

        // create an Edit Text in the main activity that will take day or night from the user
        // which will change the background accordingly
        binding.btnChange.setOnClickListener {
            val state = binding.etState.text.toString().lowercase()
            when (state) {
                "day" -> {
                    val background = Background()
                    background.changeBackground(myLayout, Background.day)
                    Log.d(Tages.mainTag, "Day")
                }
                "night" -> {
                    val background = Background()
                    background.changeBackground(myLayout, Background.night)
                    Log.d(Tages.mainTag, "Night")
                }
                else -> {
                    Log.d(Tages.mainTag, "Enter Day or Night Only!")
                }
            }
        }
    }
}