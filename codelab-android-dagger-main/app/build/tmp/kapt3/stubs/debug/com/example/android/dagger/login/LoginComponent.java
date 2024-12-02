package com.example.android.dagger.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/dagger/login/LoginComponent;", "", "inject", "", "activity", "Lcom/example/android/dagger/login/LoginActivity;", "Factory", "app_debug"})
@dagger.Subcomponent
@com.example.android.dagger.di.ActivityScope
public abstract interface LoginComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.login.LoginActivity activity);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/android/dagger/login/LoginComponent$Factory;", "", "create", "Lcom/example/android/dagger/login/LoginComponent;", "app_debug"})
    @dagger.Subcomponent.Factory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.android.dagger.login.LoginComponent create();
    }
}