package com.example.android.dagger.splash;

import java.lang.System;

/**
 * MainViewModel is the ViewModel that [SplashActivity] uses to
 * obtain information of what to show on the screen.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/android/dagger/splash/SplashViewModel;", "", "userDataRepository", "Lcom/example/android/dagger/user/UserDataRepository;", "(Lcom/example/android/dagger/user/UserDataRepository;)V", "notificationsText", "", "getNotificationsText", "()Ljava/lang/String;", "welcomeText", "getWelcomeText", "app_debug"})
public final class SplashViewModel {
    private final com.example.android.dagger.user.UserDataRepository userDataRepository = null;
    
    @javax.inject.Inject
    public SplashViewModel(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.user.UserDataRepository userDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWelcomeText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNotificationsText() {
        return null;
    }
}