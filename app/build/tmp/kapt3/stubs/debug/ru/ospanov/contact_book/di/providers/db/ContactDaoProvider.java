package ru.ospanov.contact_book.di.providers.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lru/ospanov/contact_book/di/providers/db/ContactDaoProvider;", "Ljavax/inject/Provider;", "Lru/ospanov/contact_book/data/db/ContactDao;", "database", "Lru/ospanov/contact_book/data/db/ContactsDatabase;", "(Lru/ospanov/contact_book/data/db/ContactsDatabase;)V", "get", "app_debug"})
@toothpick.InjectConstructor()
public final class ContactDaoProvider implements javax.inject.Provider<ru.ospanov.contact_book.data.db.ContactDao> {
    private final ru.ospanov.contact_book.data.db.ContactsDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.ospanov.contact_book.data.db.ContactDao get() {
        return null;
    }
    
    public ContactDaoProvider(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.ContactsDatabase database) {
        super();
    }
}