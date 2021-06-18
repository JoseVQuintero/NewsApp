package com.danisable.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_subcription.*
import kotlinx.android.synthetic.main.activity_subcription.view.*

class SubcriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subcription)

        val email = intent.getStringExtra("email")
        tvSubscriptionEmail.text = email

        btMoreNews.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finishAffinity()
        }

    }
}