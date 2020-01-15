package ru.ospanov.contact_book.ui.main.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010#\u001a\u00020\fH\u0007J\b\u0010$\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006("}, d2 = {"Lru/ospanov/contact_book/ui/main/add/ContactAddFragment;", "Lru/ospanov/contact_book/ui/common/BaseFragment;", "Lru/ospanov/contact_book/ui/main/add/ContactAddView;", "Lru/ospanov/contact_book/ui/common/BackButtonListener;", "()V", "contactAddInteractor", "Lru/ospanov/contact_book/ui/main/add/IContactAddInteractor;", "getContactAddInteractor", "()Lru/ospanov/contact_book/ui/main/add/IContactAddInteractor;", "setContactAddInteractor", "(Lru/ospanov/contact_book/ui/main/add/IContactAddInteractor;)V", "presenter", "Lru/ospanov/contact_book/ui/main/add/ContactAddPresenter;", "getPresenter", "()Lru/ospanov/contact_book/ui/main/add/ContactAddPresenter;", "setPresenter", "(Lru/ospanov/contact_book/ui/main/add/ContactAddPresenter;)V", "router", "Lru/terrakok/cicerone/Router;", "getRouter", "()Lru/terrakok/cicerone/Router;", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewCreated", "view", "providePresenter", "setupToolbar", "showToast", "text", "", "app_debug"})
public final class ContactAddFragment extends ru.ospanov.contact_book.ui.common.BaseFragment implements ru.ospanov.contact_book.ui.main.add.ContactAddView, ru.ospanov.contact_book.ui.common.BackButtonListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ru.ospanov.contact_book.ui.main.add.IContactAddInteractor contactAddInteractor;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public ru.ospanov.contact_book.ui.main.add.ContactAddPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.ospanov.contact_book.ui.main.add.IContactAddInteractor getContactAddInteractor() {
        return null;
    }
    
    public final void setContactAddInteractor(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.add.IContactAddInteractor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.ospanov.contact_book.ui.main.add.ContactAddPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.add.ContactAddPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter()
    public final ru.ospanov.contact_book.ui.main.add.ContactAddPresenter providePresenter() {
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
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    private final void setupToolbar() {
    }
    
    public ContactAddFragment() {
        super();
    }
}