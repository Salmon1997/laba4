package ru.ospanov.contact_book.ui.main.add;

import java.lang.Override;
import ru.ospanov.contact_book.data.db.repository.IContactRepository;
import toothpick.Factory;
import toothpick.Scope;

public final class ContactAddInteractor__Factory implements Factory<ContactAddInteractor> {
  @Override
  public ContactAddInteractor createInstance(Scope scope) {
    scope = getTargetScope(scope);
    IContactRepository param1 = scope.getInstance(IContactRepository.class);
    ContactAddInteractor contactAddInteractor = new ContactAddInteractor(param1);
    return contactAddInteractor;
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
