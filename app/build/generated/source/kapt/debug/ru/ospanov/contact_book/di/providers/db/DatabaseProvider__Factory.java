package ru.ospanov.contact_book.di.providers.db;

import android.content.Context;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class DatabaseProvider__Factory implements Factory<DatabaseProvider> {
  @Override
  public DatabaseProvider createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Context param1 = scope.getInstance(Context.class);
    DatabaseProvider databaseProvider = new DatabaseProvider(param1);
    return databaseProvider;
  }

  @Override
  public Scope getTargetScope(Scope scope) {
    return scope;
  }

  @Override
  public boolean hasScopeAnnotation() {
    return false;
  }

  @Override
  public boolean hasSingletonAnnotation() {
    return false;
  }

  @Override
  public boolean hasReleasableAnnotation() {
    return false;
  }

  @Override
  public boolean hasProvidesSingletonAnnotation() {
    return false;
  }

  @Override
  public boolean hasProvidesReleasableAnnotation() {
    return false;
  }
}
