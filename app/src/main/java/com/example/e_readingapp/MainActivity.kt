package com.example.e_readingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin:Button
    lateinit var btnSignUp:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        click()
    }
    fun castView(){
        btnLogin=findViewById(R.id.btnLogin)
        btnSignUp=findViewById(R.id.btnSignUp)
    }
    fun click(){
        btnLogin.setOnClickListener {
            var intent = Intent(baseContext,LoginActivity::class.java)
            startActivity(intent)
        }
        btnSignUp.setOnClickListener {
            var intent=Intent(baseContext,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}