package com.practicum.playlistmaker


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Settingactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        findViewById<Button>(R.id.button_arrow_back).setOnClickListener { finish() }


    }
}