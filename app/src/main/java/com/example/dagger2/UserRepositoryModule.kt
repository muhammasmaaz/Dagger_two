package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {
    @Provides
    fun getfirebaserepository():UserRepository{
        return firebaseRepository()
    }
}