package com.example.android.hilt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/hilt/LogApplication;", "Landroid/app/Application;", "()V", "serviceLocator", "Lcom/example/android/hilt/ServiceLocator;", "getServiceLocator", "()Lcom/example/android/hilt/ServiceLocator;", "setServiceLocator", "(Lcom/example/android/hilt/ServiceLocator;)V", "onCreate", "", "app_debug"})
@dagger.hilt.android.HiltAndroidApp
public final class LogApplication extends android.app.Application {
    public com.example.android.hilt.ServiceLocator serviceLocator;
    
    public LogApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.hilt.ServiceLocator getServiceLocator() {
        return null;
    }
    
    public final void setServiceLocator(@org.jetbrains.annotations.NotNull
    com.example.android.hilt.ServiceLocator p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
}