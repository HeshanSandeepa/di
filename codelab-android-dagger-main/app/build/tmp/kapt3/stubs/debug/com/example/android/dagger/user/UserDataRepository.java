package com.example.android.dagger.user;

import java.lang.System;

/**
 * UserDataRepository contains user-specific data such as username and unread notifications.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/example/android/dagger/user/UserDataRepository;", "", "userManager", "Lcom/example/android/dagger/user/UserManager;", "(Lcom/example/android/dagger/user/UserManager;)V", "unreadNotifications", "", "getUnreadNotifications", "()I", "setUnreadNotifications", "(I)V", "username", "", "getUsername", "()Ljava/lang/String;", "refreshUnreadNotifications", "", "app_debug"})
@com.example.android.dagger.di.LoggedUserScope
public final class UserDataRepository {
    private final com.example.android.dagger.user.UserManager userManager = null;
    private int unreadNotifications;
    
    @javax.inject.Inject
    public UserDataRepository(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.user.UserManager userManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final int getUnreadNotifications() {
        return 0;
    }
    
    public final void setUnreadNotifications(int p0) {
    }
    
    public final void refreshUnreadNotifications() {
    }
}