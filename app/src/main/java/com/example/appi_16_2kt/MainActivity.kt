package com.example.appi_16_2kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker
import com.unsplash.pickerandroid.photopicker.presentation.UnsplashPickerActivity

class MainActivity : AppCompatActivity() {
    var accessKey = "V9aaJ9tmuIBxgY4q40S9S2HNHTVhFjay0lcUzIwr5fM"
    var secretKey = "WeN7foTBeRPiDo5cLQW_d97IcN9tzKlNkN3CxbRrIkw"
    var isMultipleSelection = false

   private var REQUEST_CODE = 1
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        UnsplashPhotoPicker.init(this.application,accessKey,secretKey, 20)

        startActivityForResult(UnsplashPickerActivity.getStartingIntent(this, isMultipleSelection), REQUEST_CODE)

    }
}