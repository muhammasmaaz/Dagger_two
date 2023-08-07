package com.example.dagger2

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface Notificationservice{
    fun Send(to:String,from:String?,body:String?)

}
class Emailsent @Inject constructor() :Notificationservice{
    override fun Send(to:String, from:String?, body:String?){
        Log.d(TAG,"Email send")
    }
}
class Messageservice :Notificationservice{
    override fun Send(to:String, from:String?, body:String?){
        Log.d(TAG,"Message send")
    }
}