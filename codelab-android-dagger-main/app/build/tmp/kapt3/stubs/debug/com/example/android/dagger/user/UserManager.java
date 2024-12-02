package com.example.android.dagger.user;

import java.lang.System;

/**
 * Handles User lifecycle. Manages registrations, logs in and logs out.
 * Knows when the user is logged in.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/example/android/dagger/user/UserManager;", "", "storage", "Lcom/example/android/dagger/storage/Storage;", "userComponentFactory", "Lcom/example/android/dagger/user/UserComponent$Factory;", "(Lcom/example/android/dagger/storage/Storage;Lcom/example/android/dagger/user/UserComponent$Factory;)V", "<set-?>", "Lcom/example/android/dagger/user/UserComponent;", "userComponent", "getUserComponent", "()Lcom/example/android/dagger/user/UserComponent;", "username", "", "getUsername", "()Ljava/lang/String;", "isUserLoggedIn", "", "isUserRegistered", "loginUser", "password", "logout", "", "registerUser", "unregister", "userJustLoggedIn", "app_debug"})
@javax.inject.Singleton
public final class UserManager {
    private final com.example.android.dagger.storage.Storage storage = null;
    private final com.example.android.dagger.user.UserComponent.Factory userComponentFactory = null;
    @org.jetbrains.annotations.Nullable
    private com.example.android.dagger.user.UserComponent userComponent;
    
    @javax.inject.Inject
    public UserManager(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.storage.Storage storage, @org.jetbrains.annotations.NotNull
    com.example.android.dagger.user.UserComponent.Factory userComponentFactory) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.android.dagger.user.UserComponent getUserComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final boolean isUserLoggedIn() {
        return false;
    }
    
    public final boolean isUserRegistered() {
        return false;
    }
    
    public final void registerUser(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
    }
    
    public final boolean loginUser(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return false;
    }
    
    public final void logout() {
    }
    
    public final void unregister() {
    }
    
    private final void userJustLoggedIn() {
    }
}