package com.example.android.dagger.login;

import java.lang.System;

/**
 * LoginViewModel is the ViewModel that [LoginActivity] uses to
 * obtain information of what to show on the screen and handle complex logic.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/android/dagger/login/LoginViewModel;", "", "userManager", "Lcom/example/android/dagger/user/UserManager;", "(Lcom/example/android/dagger/user/UserManager;)V", "_loginState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/dagger/login/LoginViewState;", "loginState", "Landroidx/lifecycle/LiveData;", "getLoginState", "()Landroidx/lifecycle/LiveData;", "getUsername", "", "login", "", "username", "password", "unregister", "app_debug"})
public final class LoginViewModel {
    private final com.example.android.dagger.user.UserManager userManager = null;
    private final androidx.lifecycle.MutableLiveData<com.example.android.dagger.login.LoginViewState> _loginState = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.user.UserManager userManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.android.dagger.login.LoginViewState> getLoginState() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final void unregister() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
}