package com.example.milkapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.milkapp.R

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        print("new msg cominng")
    }
    fun implAds(){
        print("All Ads are implemented....")
        print("All Ads are implemented2....")
    }
}