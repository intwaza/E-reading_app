package com.example.e_readingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.*

class SignUpActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etEmail2: EditText
    lateinit var spGender:Spinner
    lateinit var etPhone: EditText
    lateinit var etPassword:EditText
    lateinit var etConfirmPassword:EditText
    lateinit var btnSignup2:Button
    lateinit var btnLogin3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        castView()
        click()
    }
    fun castView(){
        etName=findViewById(R.id.etName)
        etEmail2=findViewById(R.id.etEmail2)
        etPhone= findViewById(R.id.etPhone)
        etPassword= findViewById(R.id.etPassword)
        etConfirmPassword= findViewById(R.id.etConfirmPassword)
        btnSignup2= findViewById(R.id.btnSignUp2)
        btnLogin3= findViewById(R.id.btnLogin3)
        spGender= findViewById(R.id.spGender)
        var gender = arrayOf("choose gender","Female","male","Binary")
        var genderAdapter=ArrayAdapter(baseContext,android.R.layout.simple_spinner_item,gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter=genderAdapter
    }
    fun click(){
        var error= false
        btnSignup2.setOnClickListener {
            var name= etName.text.toString()
            if(name.isEmpty()){
                error=true
                etName.setError("Name is required")
            }
            var email=etEmail2.text.toString()
            if (email.isEmpty()){
                error=true
                etEmail2.setError("Email is required")
            }
            var gender=""
            if (spGender.selectedItemPosition!=0){
                gender = spGender.selectedItem.toString()
            }
            else{
                error = true
                Toast.makeText(baseContext,"select Nationality", Toast.LENGTH_LONG).show()
            }

            var password=etPassword.text.toString()
            if (password.isEmpty()){
                error=true
                etPassword.setError("Password is required")
            }
            var confirmPassword=etConfirmPassword.text.toString()
            if (confirmPassword.isEmpty()){
                error=true
                etConfirmPassword.setError("this field is required")
            }
            if (error!=true){
                var intent= Intent(baseContext,LibraryActivity::class.java)
                startActivity(intent)
            }

        }
        btnLogin3.setOnClickListener{
            var intent = Intent(baseContext,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
