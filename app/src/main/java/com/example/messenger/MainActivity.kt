package com.example.messenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialisation of views
        var userEmail: TextView = findViewById(R.id.et_userEmail)
        var userPassword: TextView = findViewById(R.id.et_userPassword)
        var logInButton : Button = findViewById(R.id.btn_login)

        logInButton.setOnClickListener {

            //u workflow
        }



    }
}