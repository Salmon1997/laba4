package ru.ospanov.contact_book.ui.main.contacts.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rJ\u0006\u0010\u000e\u001a\u00020\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactsAdapter$ViewHolder;", "clickListener", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "items", "", "Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactAdapterModel;", "addItems", "newItems", "", "clearDbItems", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ContactsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<ru.ospanov.contact_book.ui.main.contacts.adapters.ContactsAdapter.ViewHolder> {
    private final java.util.List<ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel> items = null;
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.ospanov.contact_book.ui.main.contacts.adapters.ContactsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    ru.ospanov.contact_book.ui.main.contacts.adapters.ContactsAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel> newItems) {
    }
    
    public final void clearDbItems() {
    }
    
    public ContactsAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> clickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lkotlinx/android/extensions/LayoutContainer;", "containerView", "Landroid/view/View;", "(Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactsAdapter;Landroid/view/View;)V", "getContainerView", "()Landroid/view/View;", "bind", "", "contact", "Lru/ospanov/contact_book/ui/main/contacts/adapters/ContactAdapterModel;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements kotlinx.android.extensions.LayoutContainer {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View containerView = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel contact) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View getContainerView() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View containerView) {
            super(null);
        }
    }
}