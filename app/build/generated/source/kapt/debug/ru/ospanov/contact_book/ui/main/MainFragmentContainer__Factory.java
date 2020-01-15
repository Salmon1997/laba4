package ru.ospanov.contact_book.ui.main;

import java.lang.Override;
import toothpick.Factory;
import toothpick.MemberInjector;
import toothpick.Scope;

public final class MainFragmentContainer__Factory implements Factory<MainFragmentContainer> {
  private MemberInjector<MainFragmentContainer> memberInjector = new ru.ospanov.contact_book.ui.main.MainFragmentContainer__MemberInjector();

  @Override
  public MainFragmentContainer createInstance(Scope scope) {
    scope = getTargetScope(scope);
    MainFragmentContainer mainFragmentContainer = new MainFragmentContainer();
    memberInjector.inject(mainFragmentContainer, scope);
    return mainFragmentContainer;
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
