package ru.ospanov.contact_book.data.db.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00120\u0011H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lru/ospanov/contact_book/data/db/repository/ContactRepository;", "Lru/ospanov/contact_book/data/db/repository/IContactRepository;", "contactDao", "Lru/ospanov/contact_book/data/db/ContactDao;", "(Lru/ospanov/contact_book/data/db/ContactDao;)V", "deleteContact", "Lio/reactivex/Maybe;", "", "id", "", "getContactById", "Lio/reactivex/Single;", "Lru/ospanov/contact_book/data/db/model/Contact;", "insertContact", "Lio/reactivex/Completable;", "contact", "observeContacts", "Lio/reactivex/Observable;", "", "updateContact", "app_debug"})
@toothpick.InjectConstructor()
public final class ContactRepository implements ru.ospanov.contact_book.data.db.repository.IContactRepository {
    private final ru.ospanov.contact_book.data.db.ContactDao contactDao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable insertContact(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.model.Contact contact) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable updateContact(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.model.Contact contact) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Maybe<java.lang.Integer> deleteContact(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<ru.ospanov.contact_book.data.db.model.Contact> getContactById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<ru.ospanov.contact_book.data.db.model.Contact>> observeContacts() {
        return null;
    }
    
    public ContactRepository(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.ContactDao contactDao) {
        super();
    }
}