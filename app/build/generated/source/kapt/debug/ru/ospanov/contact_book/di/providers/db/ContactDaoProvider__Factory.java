package ru.ospanov.contact_book.di.providers.db;

import java.lang.Override;
import ru.ospanov.contact_book.data.db.ContactsDatabase;
import toothpick.Factory;
import toothpick.Scope;

public final class ContactDaoProvider__Factory implements Factory<ContactDaoProvider> {
  @Override
  public ContactDaoProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    ContactsDatabase param1 = scope.getInstance(ContactsDatabase.class);
    ContactDaoProvider contactDaoProvider = new ContactDaoProvider(param1);
    return contactDaoProvider;
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
