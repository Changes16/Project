package com.example.projectit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.projectit.databinding.ActivitySettingsBinding

class SettingsActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val setting_notification: Button = findViewById(R.id.settings_1)

        setting_notification.setOnClickListener {
            val intent = Intent(this, SettingsNotificationsActivity::class.java)
            startActivity(intent)
        }
    }
}