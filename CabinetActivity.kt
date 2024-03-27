package com.example.projectit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.projectit.databinding.ActivityCabinetBinding

class CabinetActivity: AppCompatActivity() {

    private lateinit var binding: ActivityCabinetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCabinetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val delivery: Button = findViewById(R.id.delivery_app)
        val payment: Button = findViewById(R.id.payment_app)
        val expectation: Button = findViewById(R.id.expectation_app)
        val refund: Button = findViewById(R.id.refund_app)
        val help: Button = findViewById(R.id.help_app)
        val settings: Button = findViewById(R.id.settings_app)
        val app: Button = findViewById(R.id.of_app)

        delivery.setOnClickListener {
            val intent = Intent(this, DeliveryActivity::class.java)
            startActivity(intent)
        }

        payment.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }

        expectation.setOnClickListener {
            val intent = Intent(this, ExpectationActivity::class.java)
            startActivity(intent)
        }

        refund.setOnClickListener {
            val intent = Intent(this, RefundActivity::class.java)
            startActivity(intent)
        }

        help.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }

        settings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        app.setOnClickListener {
            val intent = Intent(this, AppActivity::class.java)
            startActivity(intent)
        }
    }
}
