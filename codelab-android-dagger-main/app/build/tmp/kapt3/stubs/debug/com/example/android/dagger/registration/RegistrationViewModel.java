package com.example.android.dagger.registration;

import java.lang.System;

/**
 * RegistrationViewModel is the ViewModel that the Registration flow ([RegistrationActivity]
 * and fragments) uses to keep user's input data.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tR\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/android/dagger/registration/RegistrationViewModel;", "", "userManager", "Lcom/example/android/dagger/user/UserManager;", "(Lcom/example/android/dagger/user/UserManager;)V", "acceptedTCs", "", "Ljava/lang/Boolean;", "password", "", "getUserManager", "()Lcom/example/android/dagger/user/UserManager;", "username", "acceptTCs", "", "registerUser", "updateUserData", "app_debug"})
@com.example.android.dagger.di.ActivityScope
public final class RegistrationViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.android.dagger.user.UserManager userManager = null;
    private java.lang.String username;
    private java.lang.String password;
    private java.lang.Boolean acceptedTCs;
    
    @javax.inject.Inject
    public RegistrationViewModel(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.user.UserManager userManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.dagger.user.UserManager getUserManager() {
        return null;
    }
    
    public final void updateUserData(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void acceptTCs() {
    }
    
    public final void registerUser() {
    }
}