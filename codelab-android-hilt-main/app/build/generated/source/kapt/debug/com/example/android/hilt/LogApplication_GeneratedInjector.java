package com.example.android.hilt;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = LogApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface LogApplication_GeneratedInjector {
  void injectLogApplication(LogApplication logApplication);
}
