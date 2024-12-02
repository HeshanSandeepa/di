package com.example.android.dagger.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/android/dagger/splash/SplashActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "splashViewModel", "Lcom/example/android/dagger/splash/SplashViewModel;", "getSplashViewModel", "()Lcom/example/android/dagger/splash/SplashViewModel;", "setSplashViewModel", "(Lcom/example/android/dagger/splash/SplashViewModel;)V", "userManager", "Lcom/example/android/dagger/user/UserManager;", "getUserManager", "()Lcom/example/android/dagger/user/UserManager;", "setUserManager", "(Lcom/example/android/dagger/user/UserManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_debug"})
public final class SplashActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public com.example.android.dagger.user.UserManager userManager;
    @javax.inject.Inject
    public com.example.android.dagger.splash.SplashViewModel splashViewModel;
    private java.util.HashMap _$_findViewCache;
    
    public SplashActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.dagger.user.UserManager getUserManager() {
        return null;
    }
    
    public final void setUserManager(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.user.UserManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.dagger.splash.SplashViewModel getSplashViewModel() {
        return null;
    }
    
    public final void setSplashViewModel(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.splash.SplashViewModel p0) {
    }
    
    /**
     * If the User is not registered, RegistrationActivity will be launched,
     * If the User is not logged in, LoginActivity will be launched,
     * else carry on with MainActivity
     */
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
}