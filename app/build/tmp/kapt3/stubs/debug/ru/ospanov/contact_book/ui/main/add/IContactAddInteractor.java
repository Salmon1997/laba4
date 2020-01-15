package ru.ospanov.contact_book.ui.main.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lru/ospanov/contact_book/ui/main/add/IContactAddInteractor;", "", "addContact", "Lio/reactivex/Completable;", "contact", "Lru/ospanov/contact_book/data/db/model/Contact;", "app_debug"})
public abstract interface IContactAddInteractor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable addContact(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.model.Contact contact);
}