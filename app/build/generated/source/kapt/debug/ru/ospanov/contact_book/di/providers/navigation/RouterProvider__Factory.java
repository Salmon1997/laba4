package ru.ospanov.contact_book.di.providers.navigation;

import java.lang.Override;
import ru.terrakok.cicerone.Cicerone;
import toothpick.Factory;
import toothpick.Scope;

public final class RouterProvider__Factory implements Factory<RouterProvider> {
  @Override
  public RouterProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Cicerone param1 = scope.getInstance(Cicerone.class);
    RouterProvider routerProvider = new RouterProvider(param1);
    return routerProvider;
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
