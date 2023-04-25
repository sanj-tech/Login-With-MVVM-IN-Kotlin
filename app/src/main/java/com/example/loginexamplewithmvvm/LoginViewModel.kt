package com.example.loginexamplewithmvvm

import android.widget.Toast
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    fun login(userName:String,password:String):Boolean{
if (userName.isEmpty()&&(password.isEmpty())){
    return false
}
        else return userName.equals("sanj")&&password.equals("priya")

    }
}