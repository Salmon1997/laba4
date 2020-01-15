package com.arellomobile.mvp;

import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import java.lang.Class;
import java.lang.Object;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ospanov.contact_book.ui.main.add.ContactAddFragment;
import ru.ospanov.contact_book.ui.main.add.ContactAddFragment$$PresentersBinder;
import ru.ospanov.contact_book.ui.main.add.ContactAddPresenter;
import ru.ospanov.contact_book.ui.main.add.ContactAddPresenter$$ViewStateProvider;
import ru.ospanov.contact_book.ui.main.contacts.ContactsFragment;
import ru.ospanov.contact_book.ui.main.contacts.ContactsFragment$$PresentersBinder;
import ru.ospanov.contact_book.ui.main.contacts.ContactsPresenter;
import ru.ospanov.contact_book.ui.main.contacts.ContactsPresenter$$ViewStateProvider;
import ru.ospanov.contact_book.ui.main.detail.ContactDetailFragment;
import ru.ospanov.contact_book.ui.main.detail.ContactDetailFragment$$PresentersBinder;
import ru.ospanov.contact_book.ui.main.detail.ContactDetailPresenter;
import ru.ospanov.contact_book.ui.main.detail.ContactDetailPresenter$$ViewStateProvider;

public final class MoxyReflector {
	private static Map<Class<?>, Object> sViewStateProviders;

	private static Map<Class<?>, List<Object>> sPresenterBinders;

	private static Map<Class<?>, Object> sStrategies;

	static {
		sViewStateProviders = new HashMap<>();
		sViewStateProviders.put(ContactAddPresenter.class, new ContactAddPresenter$$ViewStateProvider());
		sViewStateProviders.put(ContactsPresenter.class, new ContactsPresenter$$ViewStateProvider());
		sViewStateProviders.put(ContactDetailPresenter.class, new ContactDetailPresenter$$ViewStateProvider());

		sPresenterBinders = new HashMap<>();
		sPresenterBinders.put(ContactAddFragment.class, Arrays.<Object>asList(new ContactAddFragment$$PresentersBinder()));
		sPresenterBinders.put(ContactsFragment.class, Arrays.<Object>asList(new ContactsFragment$$PresentersBinder()));
		sPresenterBinders.put(ContactDetailFragment.class, Arrays.<Object>asList(new ContactDetailFragment$$PresentersBinder()));

		sStrategies = new HashMap<>();
		sStrategies.put(AddToEndSingleStrategy.class, new AddToEndSingleStrategy());
		sStrategies.put(OneExecutionStateStrategy.class, new OneExecutionStateStrategy());
		sStrategies.put(SkipStrategy.class, new SkipStrategy());
	}

	public static Object getViewState(Class<?> presenterClass) {
		ViewStateProvider viewStateProvider = (ViewStateProvider) sViewStateProviders.get(presenterClass);
		if (viewStateProvider == null) {
			return null;
		}

		return viewStateProvider.getViewState();
	}

	public static List<Object> getPresenterBinders(Class<?> delegated) {
		return sPresenterBinders.get(delegated);
	}

	public static Object getStrategy(Class<?> strategyClass) {
		return sStrategies.get(strategyClass);
	}
}
