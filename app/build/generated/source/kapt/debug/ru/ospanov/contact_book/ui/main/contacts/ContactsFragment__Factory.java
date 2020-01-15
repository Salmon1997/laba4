package ru.ospanov.contact_book.ui.main.contacts;

import java.lang.Override;
import toothpick.Factory;
import toothpick.MemberInjector;
import toothpick.Scope;

public final class ContactsFragment__Factory implements Factory<ContactsFragment> {
  private MemberInjector<ContactsFragment> memberInjector = new ru.ospanov.contact_book.ui.main.contacts.ContactsFragment__MemberInjector();

  @Override
  public ContactsFragment createInstance(Scope scope) {
    scope = getTargetScope(scope);
    ContactsFragment contactsFragment = new ContactsFragment();
    memberInjector.inject(contactsFragment, scope);
    return contactsFragment;
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
