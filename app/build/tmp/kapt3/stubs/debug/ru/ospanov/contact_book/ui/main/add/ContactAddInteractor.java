package ru.ospanov.contact_book.ui.main.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/ospanov/contact_book/ui/main/add/ContactAddInteractor;", "Lru/ospanov/contact_book/ui/main/add/IContactAddInteractor;", "contactsRepository", "Lru/ospanov/contact_book/data/db/repository/IContactRepository;", "(Lru/ospanov/contact_book/data/db/repository/IContactRepository;)V", "addContact", "Lio/reactivex/Completable;", "contact", "Lru/ospanov/contact_book/data/db/model/Contact;", "app_debug"})
@toothpick.InjectConstructor()
public final class ContactAddInteractor implements ru.ospanov.contact_book.ui.main.add.IContactAddInteractor {
    private final ru.ospanov.contact_book.data.db.repository.IContactRepository contactsRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable addContact(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.model.Contact contact) {
        return null;
    }
    
    public ContactAddInteractor(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.repository.IContactRepository contactsRepository) {
        super();
    }
}