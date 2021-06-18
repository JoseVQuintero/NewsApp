package com.danisable.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_dialog_subcription.*
import kotlinx.android.synthetic.main.activity_dialog_subcription.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_subcription.*
import kotlinx.android.synthetic.main.activity_subcription.view.*
import kotlinx.android.synthetic.main.activity_subcription.view.tvSubscriptionEmail

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btBoletin.setOnClickListener(this)

        tvContents.movementMethod = ScrollingMovementMethod()
    }

    override fun onClick(view: View?)  {

        when(view?.id){
            R.id.btBoletin -> {
                val dialogSubscription = LayoutInflater.from(this).inflate(R.layout.activity_dialog_subcription, null)
                val alertSubscription = AlertDialog.Builder(this).setView(dialogSubscription).create()
                //alertSubscription.setCancelable(false)
                alertSubscription.show()

                dialogSubscription.btSend.setOnClickListener {
                    val email = dialogSubscription.etEmail.text.toString()
                    val intent = Intent(this, SubcriptionActivity::class.java)
                    intent.putExtra("email", "$email")
                    startActivity(intent)
                    finishAffinity()
                }
            }

        }
    }
}

