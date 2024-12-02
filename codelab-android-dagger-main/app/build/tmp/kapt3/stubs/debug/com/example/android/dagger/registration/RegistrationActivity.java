package com.example.android.dagger.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0015\u001a\u00020\u0010R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/example/android/dagger/registration/RegistrationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "registrationComponent", "Lcom/example/android/dagger/registration/RegistrationComponent;", "getRegistrationComponent", "()Lcom/example/android/dagger/registration/RegistrationComponent;", "setRegistrationComponent", "(Lcom/example/android/dagger/registration/RegistrationComponent;)V", "registrationViewModel", "Lcom/example/android/dagger/registration/RegistrationViewModel;", "getRegistrationViewModel", "()Lcom/example/android/dagger/registration/RegistrationViewModel;", "setRegistrationViewModel", "(Lcom/example/android/dagger/registration/RegistrationViewModel;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetailsEntered", "onTermsAndConditionsAccepted", "app_debug"})
public final class RegistrationActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public com.example.android.dagger.registration.RegistrationViewModel registrationViewModel;
    public com.example.android.dagger.registration.RegistrationComponent registrationComponent;
    private java.util.HashMap _$_findViewCache;
    
    public RegistrationActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.dagger.registration.RegistrationViewModel getRegistrationViewModel() {
        return null;
    }
    
    public final void setRegistrationViewModel(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.registration.RegistrationViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.android.dagger.registration.RegistrationComponent getRegistrationComponent() {
        return null;
    }
    
    public final void setRegistrationComponent(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.registration.RegistrationComponent p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Callback from EnterDetailsFragment when username and password has been entered
     */
    public final void onDetailsEntered() {
    }
    
    /**
     * Callback from T&CsFragment when TCs have been accepted
     */
    public final void onTermsAndConditionsAccepted() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
}