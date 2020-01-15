package ru.ospanov.contact_book.ui.main.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\b\u0010\b\u001a\u00020\u0003H\'\u00a8\u0006\t"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/ContactsView;", "Lcom/arellomobile/mvp/MvpView;", "addDbContacts", "", "contacts", "", "Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactAdapterModel;", "addPhoneContacts", "requestContactPermission", "app_debug"})
public abstract interface ContactsView extends com.arellomobile.mvp.MvpView {
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class)
    public abstract void addDbContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel> contacts);
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy.class)
    public abstract void addPhoneContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel> contacts);
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.SkipStrategy.class)
    public abstract void requestContactPermission();
}