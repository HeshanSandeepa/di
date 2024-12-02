package com.example.android.dagger.registration.enterdetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0019H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/android/dagger/registration/enterdetails/EnterDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "enterDetailsViewModel", "Lcom/example/android/dagger/registration/enterdetails/EnterDetailsViewModel;", "getEnterDetailsViewModel", "()Lcom/example/android/dagger/registration/enterdetails/EnterDetailsViewModel;", "setEnterDetailsViewModel", "(Lcom/example/android/dagger/registration/enterdetails/EnterDetailsViewModel;)V", "errorTextView", "Landroid/widget/TextView;", "passwordEditText", "Landroid/widget/EditText;", "registrationViewModel", "Lcom/example/android/dagger/registration/RegistrationViewModel;", "getRegistrationViewModel", "()Lcom/example/android/dagger/registration/RegistrationViewModel;", "setRegistrationViewModel", "(Lcom/example/android/dagger/registration/RegistrationViewModel;)V", "usernameEditText", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "view", "app_debug"})
public final class EnterDetailsFragment extends androidx.fragment.app.Fragment {
    
    /**
     * RegistrationViewModel is used to set the username and password information (attached to
     * Activity's lifecycle and shared between different fragments)
     * EnterDetailsViewModel is used to validate the user input (attached to this
     * Fragment's lifecycle)
     *
     * They could get combined but for the sake of the codelab, we're separating them so we have
     * different ViewModels with different lifecycles.
     */
    @javax.inject.Inject
    public com.example.android.dagger.registration.RegistrationViewModel registrationViewModel;
    @javax.inject.Inject
    public com.example.android.dagger.registration.enterdetails.EnterDetailsViewModel enterDetailsViewModel;
    private android.widget.TextView errorTextView;
    private android.widget.EditText usernameEditText;
    private android.widget.EditText passwordEditText;
    private java.util.HashMap _$_findViewCache;
    
    public EnterDetailsFragment() {
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
    public final com.example.android.dagger.registration.enterdetails.EnterDetailsViewModel getEnterDetailsViewModel() {
        return null;
    }
    
    public final void setEnterDetailsViewModel(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.registration.enterdetails.EnterDetailsViewModel p0) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupViews(android.view.View view) {
    }
}