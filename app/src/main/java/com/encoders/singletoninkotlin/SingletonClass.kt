package com.encoders.singletoninkotlin

import android.util.Log
import com.encoders.singletoninkotlin.Model.UserInfo

object SingletonClass {

     var userInfo : UserInfo = UserInfo("","")

    fun GetName() {
        Log.e("USERNAME", "This is Sigleton Class")
    }


    fun Name(): String {
        return "Sadeeq Rahman"
    }

    fun Login_User(): UserInfo {
        var UserInfo = UserInfo("Sadeeq Rahman","30")
        return UserInfo
    }

    fun Save_User_Info( name: String , age: String){
        userInfo!!.age = age
        userInfo!!.name = name
    }

    fun Get_User(): UserInfo {

        return userInfo!!
    }


}