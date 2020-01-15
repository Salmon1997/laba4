package ru.ospanov.contact_book.ui.main.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/ContactsInteractor;", "Lru/ospanov/contact_book/ui/main/contacts/IContactsInteractor;", "contactRepository", "Lru/ospanov/contact_book/data/db/repository/IContactRepository;", "contentProviderRepository", "Lru/ospanov/contact_book/data/content_provider/IContentProviderRepository;", "(Lru/ospanov/contact_book/data/db/repository/IContactRepository;Lru/ospanov/contact_book/data/content_provider/IContentProviderRepository;)V", "getPhoneContacts", "Lio/reactivex/Maybe;", "", "", "observeDbContacts", "Lio/reactivex/Observable;", "Lru/ospanov/contact_book/data/db/model/Contact;", "app_debug"})
@toothpick.InjectConstructor()
public final class ContactsInteractor implements ru.ospanov.contact_book.ui.main.contacts.IContactsInteractor {
    private final ru.ospanov.contact_book.data.db.repository.IContactRepository contactRepository = null;
    private final ru.ospanov.contact_book.data.content_provider.IContentProviderRepository contentProviderRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Maybe<java.util.List<java.lang.String>> getPhoneContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<ru.ospanov.contact_book.data.db.model.Contact>> observeDbContacts() {
        return null;
    }
    
    public ContactsInteractor(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.repository.IContactRepository contactRepository, @org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.content_provider.IContentProviderRepository contentProviderRepository) {
        super();
    }
}