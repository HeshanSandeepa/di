// Generated by Dagger (https://dagger.dev).
package com.example.android.dagger.settings;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsActivity_MembersInjector implements MembersInjector<SettingsActivity> {
  private final Provider<SettingsViewModel> settingsViewModelProvider;

  public SettingsActivity_MembersInjector(Provider<SettingsViewModel> settingsViewModelProvider) {
    this.settingsViewModelProvider = settingsViewModelProvider;
  }

  public static MembersInjector<SettingsActivity> create(
      Provider<SettingsViewModel> settingsViewModelProvider) {
    return new SettingsActivity_MembersInjector(settingsViewModelProvider);
  }

  @Override
  public void injectMembers(SettingsActivity instance) {
    injectSettingsViewModel(instance, settingsViewModelProvider.get());
  }

  @InjectedFieldSignature("com.example.android.dagger.settings.SettingsActivity.settingsViewModel")
  public static void injectSettingsViewModel(SettingsActivity instance,
      SettingsViewModel settingsViewModel) {
    instance.settingsViewModel = settingsViewModel;
  }
}
