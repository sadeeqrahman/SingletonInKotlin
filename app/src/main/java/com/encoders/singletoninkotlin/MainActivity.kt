package com.encoders.singletoninkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SingletonClass.GetName()
        SingletonClass.Name()

        Log.e("SIngletonObject", SingletonClass.toString())

       var Age =  SingletonClass.Login_User().age
       var Name =  SingletonClass.Login_User().name

        Log.e("AgeAgeAge", Age)
        Log.e("NameNameName", Name)


        SingletonClass.Save_User_Info("Waqas Rahman","22")

        startActivity(Intent(this, UserActivity::class.java))

    }
}