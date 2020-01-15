package ru.ospanov.contact_book.ui.main.detail;

import java.lang.Override;
import ru.ospanov.contact_book.data.db.repository.IContactRepository;
import toothpick.Factory;
import toothpick.Scope;

public final class ContactDetailInteractor__Factory implements Factory<ContactDetailInteractor> {
  @Override
  public ContactDetailInteractor createInstance(Scope scope) {
    scope = getTargetScope(scope);
    IContactRepository param1 = scope.getInstance(IContactRepository.class);
    ContactDetailInteractor contactDetailInteractor = new ContactDetailInteractor(param1);
    return contactDetailInteractor;
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
