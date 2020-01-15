package ru.ospanov.contact_book.ui.main.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lru/ospanov/contact_book/ui/main/add/ContactAddPresenter;", "Lru/ospanov/contact_book/ui/common/BasePresenter;", "Lru/ospanov/contact_book/ui/main/add/ContactAddView;", "contactAddInteractor", "Lru/ospanov/contact_book/ui/main/add/IContactAddInteractor;", "router", "Lru/terrakok/cicerone/Router;", "(Lru/ospanov/contact_book/ui/main/add/IContactAddInteractor;Lru/terrakok/cicerone/Router;)V", "addContact", "", "name", "", "surname", "patronymic", "phone", "email", "onBackPressed", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class ContactAddPresenter extends ru.ospanov.contact_book.ui.common.BasePresenter<ru.ospanov.contact_book.ui.main.add.ContactAddView> {
    private final ru.ospanov.contact_book.ui.main.add.IContactAddInteractor contactAddInteractor = null;
    private final ru.terrakok.cicerone.Router router = null;
    
    public final void addContact(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String surname, @org.jetbrains.annotations.NotNull()
    java.lang.String patronymic, @org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final void onBackPressed() {
    }
    
    public ContactAddPresenter(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.add.IContactAddInteractor contactAddInteractor, @org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Router router) {
        super();
    }
}