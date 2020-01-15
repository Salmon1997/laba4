package ru.ospanov.contact_book.ui.main;

import java.lang.Override;
import ru.terrakok.cicerone.NavigatorHolder;
import ru.terrakok.cicerone.Router;
import toothpick.MemberInjector;
import toothpick.Scope;

public final class MainFragmentContainer__MemberInjector implements MemberInjector<MainFragmentContainer> {
  @Override
  public void inject(MainFragmentContainer target, Scope scope) {
    target.navigatorHolder = scope.getInstance(NavigatorHolder.class);
    target.mRouter = scope.getInstance(Router.class);
  }
}
