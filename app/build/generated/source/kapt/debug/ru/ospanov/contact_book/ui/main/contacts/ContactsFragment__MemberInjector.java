package ru.ospanov.contact_book.ui.main.contacts;

import java.lang.Override;
import toothpick.MemberInjector;
import toothpick.Scope;

public final class ContactsFragment__MemberInjector implements MemberInjector<ContactsFragment> {
  @Override
  public void inject(ContactsFragment target, Scope scope) {
    target.contactsInteractor = scope.getInstance(IContactsInteractor.class);
  }
}
