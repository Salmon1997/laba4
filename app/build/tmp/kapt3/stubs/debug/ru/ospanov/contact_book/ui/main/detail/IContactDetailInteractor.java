package ru.ospanov.contact_book.ui.main.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lru/ospanov/contact_book/ui/main/detail/IContactDetailInteractor;", "", "deleteContact", "Lio/reactivex/Maybe;", "", "id", "", "getContactById", "Lio/reactivex/Single;", "Lru/ospanov/contact_book/data/db/model/Contact;", "app_debug"})
public abstract interface IContactDetailInteractor {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<ru.ospanov.contact_book.data.db.model.Contact> getContactById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Maybe<java.lang.Integer> deleteContact(long id);
}