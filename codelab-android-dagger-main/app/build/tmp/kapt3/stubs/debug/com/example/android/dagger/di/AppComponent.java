package com.example.android.dagger.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/example/android/dagger/di/AppComponent;", "", "loginComponent", "Lcom/example/android/dagger/login/LoginComponent$Factory;", "registrationComponent", "Lcom/example/android/dagger/registration/RegistrationComponent$Factory;", "userManager", "Lcom/example/android/dagger/user/UserManager;", "Factory", "app_debug"})
@dagger.Component(modules = {com.example.android.dagger.di.StorageModule.class, com.example.android.dagger.di.AppSubcomponents.class})
@javax.inject.Singleton
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.android.dagger.registration.RegistrationComponent.Factory registrationComponent();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.android.dagger.login.LoginComponent.Factory loginComponent();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.android.dagger.user.UserManager userManager();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/android/dagger/di/AppComponent$Factory;", "", "create", "Lcom/example/android/dagger/di/AppComponent;", "context", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.android.dagger.di.AppComponent create(@org.jetbrains.annotations.NotNull
        @dagger.BindsInstance
        android.content.Context context);
    }
}