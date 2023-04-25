package com.example.loginexamplewithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.loginexamplewithmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var loginViewModel: LoginViewModel
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        login()

    }

    private fun login() {
      binding.btLogin.setOnClickListener{
          var userName=binding.etUserName.text.toString()
        var password=  binding.etPassword.text.toString()

          val loginSuccessful = loginViewModel.login(userName,password)

          if (loginSuccessful) {
            Toast.makeText(this,"Login sucessfull",Toast.LENGTH_LONG).show()
          } else {
              Toast.makeText(this,"something went worng",Toast.LENGTH_LONG).show()
          }
      }
      }
    }
