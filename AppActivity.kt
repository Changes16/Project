package com.example.projectit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectit.databinding.ActivityAppBinding

open class AppActivity : AppCompatActivity(){

    private lateinit var binding: ActivityAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}