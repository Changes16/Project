package com.example.projectit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.projectit.databinding.ActivityItemsBinding

class ItemsActivity: AppCompatActivity(), PlantAdapter.Listener {
    private lateinit var binding: ActivityItemsBinding
    private val adapter = PlantAdapter(this)
    private var editLauncher: ActivityResultLauncher<Intent>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: Button = findViewById(R.id.Search)
        val button1: ImageView = findViewById(R.id.notification)

        button1.setOnClickListener {
            val myIntent = Intent(this, CabinetActivity::class.java)
            startActivity(myIntent)

        }
        button.setOnClickListener {
            editLauncher?.launch(Intent(this@ItemsActivity, SearchActivity::class.java))
        }

        init()
        editLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == RESULT_OK) {
                @Suppress("DEPRECATION")
                adapter.addPlant(it.data?.getSerializableExtra("plant") as Plant)
            }
        }
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@ItemsActivity, 2)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener{
                editLauncher?.launch(Intent(this@ItemsActivity, EditActivity::class.java))
            }
        }
    }

    override fun onClick(plant: Plant) {
        startActivity(Intent(this, Jam::class.java).apply {
            putExtra("item", plant)
        })
    }
}
