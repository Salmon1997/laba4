package ru.ospanov.contact_book.ui.main.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lru/ospanov/contact_book/ui/main/detail/ContactDetailPresenter;", "Lru/ospanov/contact_book/ui/common/BasePresenter;", "Lru/ospanov/contact_book/ui/main/detail/ContactDetailView;", "contactDetailInteractor", "Lru/ospanov/contact_book/ui/main/detail/IContactDetailInteractor;", "router", "Lru/terrakok/cicerone/Router;", "(Lru/ospanov/contact_book/ui/main/detail/IContactDetailInteractor;Lru/terrakok/cicerone/Router;)V", "deleteContact", "", "contactId", "", "onBackPressed", "showContact", "Companion", "app_debug"})
@com.arellomobile.mvp.InjectViewState()
public final class ContactDetailPresenter extends ru.ospanov.contact_book.ui.common.BasePresenter<ru.ospanov.contact_book.ui.main.detail.ContactDetailView> {
    private final ru.ospanov.contact_book.ui.main.detail.IContactDetailInteractor contactDetailInteractor = null;
    private final ru.terrakok.cicerone.Router router = null;
    private static final java.lang.String LOG_TAG = "ContactDetailPresenter";
    public static final ru.ospanov.contact_book.ui.main.detail.ContactDetailPresenter.Companion Companion = null;
    
    public final void showContact(long contactId) {
    }
    
    public final void deleteContact(long contactId) {
    }
    
    public final void onBackPressed() {
    }
    
    public ContactDetailPresenter(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.detail.IContactDetailInteractor contactDetailInteractor, @org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Router router) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/ospanov/contact_book/ui/main/detail/ContactDetailPresenter$Companion;", "", "()V", "LOG_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}