package ru.ospanov.contact_book.data.db;

import java.lang.System;

@androidx.room.Database(entities = {ru.ospanov.contact_book.data.db.model.Contact.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lru/ospanov/contact_book/data/db/ContactsDatabase;", "Landroidx/room/RoomDatabase;", "()V", "contactsDao", "Lru/ospanov/contact_book/data/db/ContactDao;", "Companion", "app_debug"})
public abstract class ContactsDatabase extends androidx.room.RoomDatabase {
    private static ru.ospanov.contact_book.data.db.ContactsDatabase INSTANCE;
    private static final java.lang.Object lock = null;
    public static final ru.ospanov.contact_book.data.db.ContactsDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.ospanov.contact_book.data.db.ContactDao contactsDao();
    
    public ContactsDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/ospanov/contact_book/data/db/ContactsDatabase$Companion;", "", "()V", "INSTANCE", "Lru/ospanov/contact_book/data/db/ContactsDatabase;", "lock", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final ru.ospanov.contact_book.data.db.ContactsDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final ru.ospanov.contact_book.data.db.ContactsDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}