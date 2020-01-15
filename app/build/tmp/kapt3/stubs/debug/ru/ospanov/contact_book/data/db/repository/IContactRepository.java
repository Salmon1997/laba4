package ru.ospanov.contact_book.data.db.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u000eH&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH&\u00a8\u0006\u0011"}, d2 = {"Lru/ospanov/contact_book/data/db/repository/IContactRepository;", "", "deleteContact", "Lio/reactivex/Maybe;", "", "id", "", "getContactById", "Lio/reactivex/Single;", "Lru/ospanov/contact_book/data/db/model/Contact;", "insertContact", "Lio/reactivex/Completable;", "contact", "observeContacts", "Lio/reactivex/Observable;", "", "updateContact", "app_debug"})
public abstract interface IContactRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable insertContact(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.model.Contact contact);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable updateContact(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.model.Contact contact);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Maybe<java.lang.Integer> deleteContact(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<ru.ospanov.contact_book.data.db.model.Contact> getContactById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<ru.ospanov.contact_book.data.db.model.Contact>> observeContacts();
}