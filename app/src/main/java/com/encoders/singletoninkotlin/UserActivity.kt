package com.encoders.singletoninkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        Log.e("SIngletonObject", SingletonClass.toString())

        Log.e("USERNAME", SingletonClass.Get_User().name)
        Log.e("USERNAME", SingletonClass.Get_User().age)
    }
}