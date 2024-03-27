package com.example.projectit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectit.databinding.ActivityJamBinding

class Jam : AppCompatActivity() {

    private lateinit var binding: ActivityJamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJamBinding.inflate(layoutInflater)
        setContentView(binding.root)
        @Suppress("DEPRECATION")
        val item = intent.getSerializableExtra("item") as Plant
        binding.apply {
            imMain.setImageResource(item.imageId)
            nameItem.text = item.title
            price.text = item.title2
            TextDS.text = item.desc
        }
    }
}
