package ru.ospanov.contact_book.ui.main.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lru/ospanov/contact_book/ui/main/add/ContactAddView;", "Lcom/arellomobile/mvp/MvpView;", "showToast", "", "text", "", "app_debug"})
public abstract interface ContactAddView extends com.arellomobile.mvp.MvpView {
    
    @com.arellomobile.mvp.viewstate.strategy.StateStrategyType(value = com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy.class)
    public abstract void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String text);
}