package ru.ospanov.contact_book.data.content_provider;

import android.content.Context;
import java.lang.Override;
import toothpick.Factory;
import toothpick.Scope;

public final class ContentProviderRepository__Factory implements Factory<ContentProviderRepository> {
  @Override
  public ContentProviderRepository createInstance(Scope scope) {
    scope = getTargetScope(scope);
    Context param1 = scope.getInstance(Context.class);
    ContentProviderRepository contentProviderRepository = new ContentProviderRepository(param1);
    return contentProviderRepository;
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
