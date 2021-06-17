package com.example.e_readingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin2:Button
    lateinit var btnSign:Button
    lateinit var etEmail:EditText
    lateinit var etPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castView()
        click()
    }
    fun castView(){
        btnLogin2=findViewById(R.id.btnLogin2)
        btnSign=findViewById(R.id.btnSign)
        etEmail= findViewById(R.id.etEmail)
        etPassword= findViewById(R.id.etEmail2)
    }
    fun click(){
        var error= false
        btnLogin2.setOnClickListener {
            var email= etEmail.text.toString()
            if (email.isEmpty()){
                error= true
                etEmail.setError("Email is required")
            }
            var password= etPassword.text.toString()
            if (password.isEmpty()){
                error= true
                etEmail.setError("password is required")
            }
            if (error!=true){
                var intent= Intent(baseContext,LibraryActivity::class.java)
                startActivity(intent)
            }
        }
        btnSign.setOnClickListener {
            var intent=Intent(baseContext,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}