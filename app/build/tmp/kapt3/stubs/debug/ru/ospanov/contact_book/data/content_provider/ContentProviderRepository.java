package ru.ospanov.contact_book.data.content_provider;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lru/ospanov/contact_book/data/content_provider/ContentProviderRepository;", "Lru/ospanov/contact_book/data/content_provider/IContentProviderRepository;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContactNames", "Lio/reactivex/Maybe;", "", "", "app_debug"})
@toothpick.InjectConstructor()
public final class ContentProviderRepository implements ru.ospanov.contact_book.data.content_provider.IContentProviderRepository {
    private final android.content.Context applicationContext = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Maybe<java.util.List<java.lang.String>> getContactNames() {
        return null;
    }
    
    public ContentProviderRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context applicationContext) {
        super();
    }
}