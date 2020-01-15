package ru.ospanov.contact_book.di.providers.navigation;

import java.lang.Override;
import ru.terrakok.cicerone.Cicerone;
import toothpick.Factory;
import toothpick.Scope;

public final class NavigatorHolderProvider__Factory implements Factory<NavigatorHolderProvider> {
  @Override
  public NavigatorHolderProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Cicerone param1 = scope.getInstance(Cicerone.class);
    NavigatorHolderProvider navigatorHolderProvider = new NavigatorHolderProvider(param1);
    return navigatorHolderProvider;
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
