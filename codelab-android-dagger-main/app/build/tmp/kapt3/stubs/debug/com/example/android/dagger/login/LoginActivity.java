package com.example.android.dagger.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/example/android/dagger/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "errorTextView", "Landroid/widget/TextView;", "loginViewModel", "Lcom/example/android/dagger/login/LoginViewModel;", "getLoginViewModel", "()Lcom/example/android/dagger/login/LoginViewModel;", "setLoginViewModel", "(Lcom/example/android/dagger/login/LoginViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public com.example.android.dagger.login.LoginViewModel loginViewModel;
    private android.widget.TextView errorTextView;
    private java.util.HashMap _$_findViewCache;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.dagger.login.LoginViewModel getLoginViewModel() {
        return null;
    }
    
    public final void setLoginViewModel(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.login.LoginViewModel p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupViews() {
    }
}