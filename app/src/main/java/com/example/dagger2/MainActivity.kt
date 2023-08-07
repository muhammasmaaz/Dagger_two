package com.example.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val userRepository=UserRepository()
//        val emailSent=Emailsent()
//
//        val userRegistrationService=UserRegistrationService(userRepository,emailSent)
        // -> here we have another problem that we create objects by own
        //      if we create object in multiple places so it is difficult to do this
        //      that is why we use dagger 2 who create object for us where we need
        //      dagger 2 is passing the objects
        // -> now BUILD project because when build is created then dagger is create
        //      class against of that userregistrationcomponent in this case whic name is Dagger userregistrationcomponent
        //      and then dagger gave us object



        val component=DaggerUserRegistrationComponent.builder().build()
        component.inject(this)
        userRegistrationService.registerUser("test@system.com","test")
    }
}
/*
*So if we need to use dagger 2 we need to add dependency and also plugin id in build gradle
*  In dagger we have consumer who is demand for object from component is get the object from the producer
*
*
 */

