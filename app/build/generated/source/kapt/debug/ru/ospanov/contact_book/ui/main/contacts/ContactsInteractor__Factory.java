package ru.ospanov.contact_book.ui.main.contacts;

import java.lang.Override;
import ru.ospanov.contact_book.data.content_provider.IContentProviderRepository;
import ru.ospanov.contact_book.data.db.repository.IContactRepository;
import toothpick.Factory;
import toothpick.Scope;

public final class ContactsInteractor__Factory implements Factory<ContactsInteractor> {
  @Override
  public ContactsInteractor createInstance(Scope scope) {
    scope = getTargetScope(scope);
    IContactRepository param1 = scope.getInstance(IContactRepository.class);
    IContentProviderRepository param2 = scope.getInstance(IContentProviderRepository.class);
    ContactsInteractor contactsInteractor = new ContactsInteractor(param1, param2);
    return contactsInteractor;
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
