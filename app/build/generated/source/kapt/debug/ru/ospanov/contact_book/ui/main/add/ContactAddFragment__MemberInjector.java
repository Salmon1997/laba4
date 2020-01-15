package ru.ospanov.contact_book.ui.main.add;

import java.lang.Override;
import toothpick.MemberInjector;
import toothpick.Scope;

public final class ContactAddFragment__MemberInjector implements MemberInjector<ContactAddFragment> {
  @Override
  public void inject(ContactAddFragment target, Scope scope) {
    target.contactAddInteractor = scope.getInstance(IContactAddInteractor.class);
  }
}
