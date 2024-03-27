package com.example.projectit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectit.databinding.ActivitySettingsNotificationsBinding

class SettingsNotificationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsNotificationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsNotificationsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}