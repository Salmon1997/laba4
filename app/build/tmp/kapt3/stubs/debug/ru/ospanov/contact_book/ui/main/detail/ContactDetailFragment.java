package ru.ospanov.contact_book.ui.main.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'H\u0016J\u001a\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010*\u001a\u00020\fH\u0007J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0018H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00060"}, d2 = {"Lru/ospanov/contact_book/ui/main/detail/ContactDetailFragment;", "Lru/ospanov/contact_book/ui/common/BaseFragment;", "Lru/ospanov/contact_book/ui/main/detail/ContactDetailView;", "Lru/ospanov/contact_book/ui/common/BackButtonListener;", "()V", "contactDetailInteractor", "Lru/ospanov/contact_book/ui/main/detail/IContactDetailInteractor;", "getContactDetailInteractor", "()Lru/ospanov/contact_book/ui/main/detail/IContactDetailInteractor;", "setContactDetailInteractor", "(Lru/ospanov/contact_book/ui/main/detail/IContactDetailInteractor;)V", "presenter", "Lru/ospanov/contact_book/ui/main/detail/ContactDetailPresenter;", "getPresenter", "()Lru/ospanov/contact_book/ui/main/detail/ContactDetailPresenter;", "setPresenter", "(Lru/ospanov/contact_book/ui/main/detail/ContactDetailPresenter;)V", "router", "Lru/terrakok/cicerone/Router;", "getRouter", "()Lru/terrakok/cicerone/Router;", "onBackPressed", "", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "providePresenter", "setContact", "contact", "Lru/ospanov/contact_book/data/db/model/Contact;", "setupToolbar", "Companion", "app_debug"})
public final class ContactDetailFragment extends ru.ospanov.contact_book.ui.common.BaseFragment implements ru.ospanov.contact_book.ui.main.detail.ContactDetailView, ru.ospanov.contact_book.ui.common.BackButtonListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ru.ospanov.contact_book.ui.main.detail.IContactDetailInteractor contactDetailInteractor;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public ru.ospanov.contact_book.ui.main.detail.ContactDetailPresenter presenter;
    private static final java.lang.String CONTACT_ID = "contact_id";
    public static final ru.ospanov.contact_book.ui.main.detail.ContactDetailFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.ospanov.contact_book.ui.main.detail.IContactDetailInteractor getContactDetailInteractor() {
        return null;
    }
    
    public final void setContactDetailInteractor(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.detail.IContactDetailInteractor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.ospanov.contact_book.ui.main.detail.ContactDetailPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.detail.ContactDetailPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter()
    public final ru.ospanov.contact_book.ui.main.detail.ContactDetailPresenter providePresenter() {
        return null;
    }
    
    private final ru.terrakok.cicerone.Router getRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void setContact(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.data.db.model.Contact contact) {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    private final void setupToolbar() {
    }
    
    public ContactDetailFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/ospanov/contact_book/ui/main/detail/ContactDetailFragment$Companion;", "", "()V", "CONTACT_ID", "", "newInstance", "Lru/ospanov/contact_book/ui/main/detail/ContactDetailFragment;", "contactId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ru.ospanov.contact_book.ui.main.detail.ContactDetailFragment newInstance(long contactId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}