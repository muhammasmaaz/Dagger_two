package com.example.dagger2

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {
    @Provides
    fun getmessageservice():Notificationservice{
        return Messageservice()
    }
}