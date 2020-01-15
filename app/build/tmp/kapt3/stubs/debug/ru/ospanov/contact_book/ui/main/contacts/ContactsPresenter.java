package ru.ospanov.contact_book.ui.main.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\tJ\b\u0010\u0010\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/ContactsPresenter;", "Lru/ospanov/contact_book/ui/common/BasePresenter;", "Lru/ospanov/contact_book/ui/main/contacts/ContactsView;", "contactsInteractor", "Lru/ospanov/contact_book/ui/main/contacts/IContactsInteractor;", "router", "Lru/terrakok/cicerone/Router;", "(Lru/ospanov/contact_book/ui/main/contacts/IContactsInteractor;Lru/terrakok/cicerone/Router;)V", "getDbContacts", "", "getPhoneContacts", "navigateToContactAdd", "navigateToContactDetail", "contactId", "", "onBackPressed", "onFirstViewAttach", "Companion", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class ContactsPresenter extends ru.ospanov.contact_book.ui.common.BasePresenter<ru.ospanov.contact_book.ui.main.contacts.ContactsView> {
    private final ru.ospanov.contact_book.ui.main.contacts.IContactsInteractor contactsInteractor = null;
    private final ru.terrakok.cicerone.Router router = null;
    private static final java.lang.String LOG_TAG = "ContactsPresenter";
    public static final ru.ospanov.contact_book.ui.main.contacts.ContactsPresenter.Companion Companion = null;
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    public final void getDbContacts() {
    }
    
    public final void getPhoneContacts() {
    }
    
    public final void navigateToContactDetail(long contactId) {
    }
    
    public final void navigateToContactAdd() {
    }
    
    public final void onBackPressed() {
    }
    
    public ContactsPresenter(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.contacts.IContactsInteractor contactsInteractor, @org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Router router) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/ContactsPresenter$Companion;", "", "()V", "LOG_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}