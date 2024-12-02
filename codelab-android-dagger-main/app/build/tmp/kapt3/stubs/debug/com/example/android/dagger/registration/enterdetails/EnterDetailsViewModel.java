package com.example.android.dagger.registration.enterdetails;

import java.lang.System;

/**
 * EnterDetailsViewModel is the ViewModel that [EnterDetailsFragment] uses to
 * obtain to validate user's input data.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lcom/example/android/dagger/registration/enterdetails/EnterDetailsViewModel;", "", "()V", "_enterDetailsState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/dagger/registration/enterdetails/EnterDetailsViewState;", "enterDetailsState", "Landroidx/lifecycle/LiveData;", "getEnterDetailsState", "()Landroidx/lifecycle/LiveData;", "validateInput", "", "username", "", "password", "app_debug"})
public final class EnterDetailsViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.android.dagger.registration.enterdetails.EnterDetailsViewState> _enterDetailsState = null;
    
    @javax.inject.Inject
    public EnterDetailsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.android.dagger.registration.enterdetails.EnterDetailsViewState> getEnterDetailsState() {
        return null;
    }
    
    public final void validateInput(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
}