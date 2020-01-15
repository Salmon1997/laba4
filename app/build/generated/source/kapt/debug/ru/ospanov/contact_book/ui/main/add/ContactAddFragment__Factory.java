package ru.ospanov.contact_book.ui.main.add;

import java.lang.Override;
import toothpick.Factory;
import toothpick.MemberInjector;
import toothpick.Scope;

public final class ContactAddFragment__Factory implements Factory<ContactAddFragment> {
  private MemberInjector<ContactAddFragment> memberInjector = new ru.ospanov.contact_book.ui.main.add.ContactAddFragment__MemberInjector();

  @Override
  public ContactAddFragment createInstance(Scope scope) {
    scope = getTargetScope(scope);
    ContactAddFragment contactAddFragment = new ContactAddFragment();
    memberInjector.inject(contactAddFragment, scope);
    return contactAddFragment;
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
