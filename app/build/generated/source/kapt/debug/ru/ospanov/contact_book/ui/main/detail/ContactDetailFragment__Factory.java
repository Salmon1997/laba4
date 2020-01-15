package ru.ospanov.contact_book.ui.main.detail;

import java.lang.Override;
import toothpick.Factory;
import toothpick.MemberInjector;
import toothpick.Scope;

public final class ContactDetailFragment__Factory implements Factory<ContactDetailFragment> {
  private MemberInjector<ContactDetailFragment> memberInjector = new ru.ospanov.contact_book.ui.main.detail.ContactDetailFragment__MemberInjector();

  @Override
  public ContactDetailFragment createInstance(Scope scope) {
    scope = getTargetScope(scope);
    ContactDetailFragment contactDetailFragment = new ContactDetailFragment();
    memberInjector.inject(contactDetailFragment, scope);
    return contactDetailFragment;
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
