package com.example.dagger2

import javax.inject.Inject


//here we use constructor injection
//now just add the @Inject annotation with constructor keyword
//@inject annotation is tell to daggar that when we u need to make object of userregistrationservice u need to call constructor keyword
//this mean that @inject is use to make object of classes by calling their constructor
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository ,
    private val notificatioservices: Notificationservice) {
    //    private val userRepository=UserRepository()
    //    private val emailsent=Emailsent()
    //now problem is solve in this case
    fun registerUser(email:String,passward:String){
        userRepository.saveUser(email, passward)
        notificatioservices.Send(email,"admin@system.com","User Register")
    }
}


/*
* -------------------------------Problems--------------------------------------
*
* Unit testing             -> As you can see if i need to test this class so i need both classes
*                               must ready which is create dependency
*
* single responsible       -> As u can see this class have two responsibility one is objects creation
*                               and the other is register user
*
* lifetime of these object -> As you can see that both object are attach to the this class so if this
*                               class is destroy then both object automatically destroy
*
* Extensible               -> these dependent object are hard coded in these case we u email sent service
*                               but in future i need to send a message to user so we need to make different
*                               object for send message
*
* So, we can solve this problem by using Manual Dependency Injection
*/