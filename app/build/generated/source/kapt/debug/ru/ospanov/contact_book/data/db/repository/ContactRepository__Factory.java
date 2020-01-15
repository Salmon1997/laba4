package ru.ospanov.contact_book.data.db.repository;

import java.lang.Override;
import ru.ospanov.contact_book.data.db.ContactDao;
import toothpick.Factory;
import toothpick.Scope;

public final class ContactRepository__Factory implements Factory<ContactRepository> {
  @Override
  public ContactRepository createInstance(Scope scope) {
    scope = getTargetScope(scope);
    ContactDao param1 = scope.getInstance(ContactDao.class);
    ContactRepository contactRepository = new ContactRepository(param1);
    return contactRepository;
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
