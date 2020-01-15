package ru.ospanov.contact_book.ui.main.contacts;

import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;

public class ContactsFragment$$PresentersBinder extends PresenterBinder<ContactsFragment> {
	@Override
	public List<PresenterField<ContactsFragment>> getPresenterFields() {
		List<PresenterField<ContactsFragment>> presenters = new ArrayList<>(1);
		presenters.add(new presenterBinder());
		return presenters;
	}

	public class presenterBinder extends PresenterField<ContactsFragment> {
		public presenterBinder() {
			super("presenter", null, ContactsPresenter.class);
		}

		@Override
		public void bind(ContactsFragment target, MvpPresenter presenter) {
			target.presenter = (ContactsPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ContactsFragment delegated) {
			return delegated.providePresenter();
		}
	}
}
