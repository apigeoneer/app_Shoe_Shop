package com.gmail.apigeoneer.shoeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gmail.apigeoneer.shoeshop.databinding.ActivityShoeBinding

class ShoeActivity : AppCompatActivity() {

    // data binding
    private lateinit var binding: ActivityShoeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_shoe)
    }
}