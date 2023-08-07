package com.example.dagger2

import dagger.Component

@Component(modules = [UserRepositoryModule::class,NotificationServiceModule::class])
//to add this it will be a component
interface UserRegistrationComponent {
    //here we tell to component that we need userregistrationservice type object
//    fun getuserRegistrtionService():UserRegistrationService
    //now we tell about how to create userregistrationservice object goto userregistrationservice class

    fun inject(mainActivity: MainActivity)
}