package com.example.android.dagger.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/android/dagger/user/UserComponent;", "", "inject", "", "activity", "Lcom/example/android/dagger/main/MainActivity;", "Lcom/example/android/dagger/settings/SettingsActivity;", "Factory", "app_debug"})
@dagger.Subcomponent
@com.example.android.dagger.di.LoggedUserScope
public abstract interface UserComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.main.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.example.android.dagger.settings.SettingsActivity activity);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/android/dagger/user/UserComponent$Factory;", "", "create", "Lcom/example/android/dagger/user/UserComponent;", "app_debug"})
    @dagger.Subcomponent.Factory
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.example.android.dagger.user.UserComponent create();
    }
}