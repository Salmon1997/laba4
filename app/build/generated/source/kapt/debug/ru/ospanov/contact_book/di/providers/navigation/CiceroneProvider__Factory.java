package ru.ospanov.contact_book.di.providers.navigation;

import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class CiceroneProvider__Factory implements Factory<CiceroneProvider> {
  @Override
  public CiceroneProvider createInstance(Scope scope) {
    CiceroneProvider ciceroneProvider = new CiceroneProvider();
    return ciceroneProvider;
  }

  @Override
  public Scope getTargetScope(Scope scope) {
    return scope;
  }

  @Override
  public boolean hasScopeAnnotation() {
    return false;
  }

  @Override
  public boolean hasSingletonAnnotation() {
    return false;
  }

  @Override
  public boolean hasReleasableAnnotation() {
    return false;
  }

  @Override
  public boolean hasProvidesSingletonAnnotation() {
    return false;
  }

  @Override
  public boolean hasProvidesReleasableAnnotation() {
    return false;
  }
}
