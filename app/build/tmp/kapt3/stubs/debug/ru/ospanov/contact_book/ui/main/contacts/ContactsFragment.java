package ru.ospanov.contact_book.ui.main.contacts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0016\u0010\u001c\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0016\u0010\u001d\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\b\u0010*\u001a\u00020\u0018H\u0016J-\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u0002000/2\u0006\u00101\u001a\u000202H\u0016\u00a2\u0006\u0002\u00103J\u001a\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\"2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u00106\u001a\u00020\u000eH\u0007J\b\u00107\u001a\u00020\u0018H\u0016J\b\u00108\u001a\u00020\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006:"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/ContactsFragment;", "Lru/ospanov/contact_book/ui/common/BaseFragment;", "Lru/ospanov/contact_book/ui/main/contacts/ContactsView;", "Lru/ospanov/contact_book/ui/common/BackButtonListener;", "()V", "contactsAdapter", "Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactsAdapter;", "contactsInteractor", "Lru/ospanov/contact_book/ui/main/contacts/IContactsInteractor;", "getContactsInteractor", "()Lru/ospanov/contact_book/ui/main/contacts/IContactsInteractor;", "setContactsInteractor", "(Lru/ospanov/contact_book/ui/main/contacts/IContactsInteractor;)V", "presenter", "Lru/ospanov/contact_book/ui/main/contacts/ContactsPresenter;", "getPresenter", "()Lru/ospanov/contact_book/ui/main/contacts/ContactsPresenter;", "setPresenter", "(Lru/ospanov/contact_book/ui/main/contacts/ContactsPresenter;)V", "router", "Lru/terrakok/cicerone/Router;", "getRouter", "()Lru/terrakok/cicerone/Router;", "addContacts", "", "contacts", "", "Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactAdapterModel;", "addDbContacts", "addPhoneContacts", "initAdapter", "onBackPressed", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyView", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "providePresenter", "requestContactPermission", "setupToolbar", "Companion", "app_debug"})
public final class ContactsFragment extends ru.ospanov.contact_book.ui.common.BaseFragment implements ru.ospanov.contact_book.ui.main.contacts.ContactsView, ru.ospanov.contact_book.ui.common.BackButtonListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public ru.ospanov.contact_book.ui.main.contacts.IContactsInteractor contactsInteractor;
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.InjectPresenter()
    public ru.ospanov.contact_book.ui.main.contacts.ContactsPresenter presenter;
    private ru.ospanov.contact_book.ui.main.contacts.adapters.ContactsAdapter contactsAdapter;
    private static final int MY_PERMISSIONS_REQUEST_READ_CONTACTS = 228;
    public static final ru.ospanov.contact_book.ui.main.contacts.ContactsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.ospanov.contact_book.ui.main.contacts.IContactsInteractor getContactsInteractor() {
        return null;
    }
    
    public final void setContactsInteractor(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.contacts.IContactsInteractor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ru.ospanov.contact_book.ui.main.contacts.ContactsPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.contacts.ContactsPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.arellomobile.mvp.presenter.ProvidePresenter()
    public final ru.ospanov.contact_book.ui.main.contacts.ContactsPresenter providePresenter() {
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
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void addDbContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel> contacts) {
    }
    
    @java.lang.Override()
    public void addPhoneContacts(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel> contacts) {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void requestContactPermission() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void addContacts(java.util.List<ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel> contacts) {
    }
    
    private final void setupToolbar() {
    }
    
    private final void initAdapter() {
    }
    
    public ContactsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/ContactsFragment$Companion;", "", "()V", "MY_PERMISSIONS_REQUEST_READ_CONTACTS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}