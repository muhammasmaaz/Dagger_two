package com.example.dagger2

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject


interface UserRepository{
    fun saveUser(email:String,passward:String)

}

class firebaseRepository @Inject constructor():UserRepository {
    override fun saveUser(email:String, passward:String){
        Log.d(TAG,"user saved in firebase")
    }
}
class databaseRepository :UserRepository {
    override fun saveUser(email:String, passward:String){
        Log.d(TAG,"user saved in database")
    }
}