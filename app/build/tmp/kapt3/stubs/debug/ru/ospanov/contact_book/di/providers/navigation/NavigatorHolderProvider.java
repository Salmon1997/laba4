package ru.ospanov.contact_book.di.providers.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lru/ospanov/contact_book/di/providers/navigation/NavigatorHolderProvider;", "Ljavax/inject/Provider;", "Lru/terrakok/cicerone/NavigatorHolder;", "cicerone", "Lru/terrakok/cicerone/Cicerone;", "Lru/terrakok/cicerone/Router;", "(Lru/terrakok/cicerone/Cicerone;)V", "get", "app_debug"})
@toothpick.InjectConstructor()
public final class NavigatorHolderProvider implements javax.inject.Provider<ru.terrakok.cicerone.NavigatorHolder> {
    private final ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> cicerone = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public ru.terrakok.cicerone.NavigatorHolder get() {
        return null;
    }
    
    public NavigatorHolderProvider(@org.jetbrains.annotations.NotNull()
    ru.terrakok.cicerone.Cicerone<ru.terrakok.cicerone.Router> cicerone) {
        super();
    }
}