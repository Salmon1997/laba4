package ru.ospanov.contact_book.ui.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lru/ospanov/contact_book/ui/common/Screens;", "", "()V", "ContactAddScreen", "ContactDetailScreen", "ContactsScreen", "app_debug"})
public final class Screens {
    
    public Screens() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lru/ospanov/contact_book/ui/common/Screens$ContactsScreen;", "Lru/terrakok/cicerone/android/support/SupportAppScreen;", "()V", "getFragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
    public static final class ContactsScreen extends ru.terrakok.cicerone.android.support.SupportAppScreen {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        public ContactsScreen() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lru/ospanov/contact_book/ui/common/Screens$ContactAddScreen;", "Lru/terrakok/cicerone/android/support/SupportAppScreen;", "()V", "getFragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
    public static final class ContactAddScreen extends ru.terrakok.cicerone.android.support.SupportAppScreen {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        public ContactAddScreen() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lru/ospanov/contact_book/ui/common/Screens$ContactDetailScreen;", "Lru/terrakok/cicerone/android/support/SupportAppScreen;", "contactId", "", "(J)V", "getFragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
    public static final class ContactDetailScreen extends ru.terrakok.cicerone.android.support.SupportAppScreen {
        private final long contactId = 0L;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getFragment() {
            return null;
        }
        
        public ContactDetailScreen(long contactId) {
            super();
        }
    }
}