package ru.ospanov.contact_book.ui.main.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u0007H&\u00a8\u0006\t"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/IContactsInteractor;", "", "getPhoneContacts", "Lio/reactivex/Maybe;", "", "", "observeDbContacts", "Lio/reactivex/Observable;", "Lru/ospanov/contact_book/data/db/model/Contact;", "app_debug"})
public abstract interface IContactsInteractor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Maybe<java.util.List<java.lang.String>> getPhoneContacts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<ru.ospanov.contact_book.data.db.model.Contact>> observeDbContacts();
}