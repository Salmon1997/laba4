package ru.ospanov.contact_book.ui.main.detail;

import java.lang.Override;
import toothpick.MemberInjector;
import toothpick.Scope;

public final class ContactDetailFragment__MemberInjector implements MemberInjector<ContactDetailFragment> {
  @Override
  public void inject(ContactDetailFragment target, Scope scope) {
    target.contactDetailInteractor = scope.getInstance(IContactDetailInteractor.class);
  }
}
