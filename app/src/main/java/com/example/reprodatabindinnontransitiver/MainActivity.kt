package com.example.reprodatabindinnontransitiver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.reprodatabindinnontransitiver.databinding.ActivityMainBinding
import kotlinx.coroutines.InternalCoroutinesApi

class MainActivity : AppCompatActivity() {

    private lateinit var homeBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        setContentView(R.layout.activity_main)

        getString(com.example.module_a.R.string.a_string)
    }
}