// Generated by Dagger (https://dagger.dev).
package com.example.android.dagger.registration.termsandconditions;

import com.example.android.dagger.registration.RegistrationViewModel;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TermsAndConditionsFragment_MembersInjector implements MembersInjector<TermsAndConditionsFragment> {
  private final Provider<RegistrationViewModel> registrationViewModelProvider;

  public TermsAndConditionsFragment_MembersInjector(
      Provider<RegistrationViewModel> registrationViewModelProvider) {
    this.registrationViewModelProvider = registrationViewModelProvider;
  }

  public static MembersInjector<TermsAndConditionsFragment> create(
      Provider<RegistrationViewModel> registrationViewModelProvider) {
    return new TermsAndConditionsFragment_MembersInjector(registrationViewModelProvider);
  }

  @Override
  public void injectMembers(TermsAndConditionsFragment instance) {
    injectRegistrationViewModel(instance, registrationViewModelProvider.get());
  }

  @InjectedFieldSignature("com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment.registrationViewModel")
  public static void injectRegistrationViewModel(TermsAndConditionsFragment instance,
      RegistrationViewModel registrationViewModel) {
    instance.registrationViewModel = registrationViewModel;
  }
}