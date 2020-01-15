package ru.ospanov.contact_book.ui.main.add;

import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;

public class ContactAddFragment$$PresentersBinder extends PresenterBinder<ContactAddFragment> {
	@Override
	public List<PresenterField<ContactAddFragment>> getPresenterFields() {
		List<PresenterField<ContactAddFragment>> presenters = new ArrayList<>(1);
		presenters.add(new presenterBinder());
		return presenters;
	}

	public class presenterBinder extends PresenterField<ContactAddFragment> {
		public presenterBinder() {
			super("presenter", null, ContactAddPresenter.class);
		}

		@Override
		public void bind(ContactAddFragment target, MvpPresenter presenter) {
			target.presenter = (ContactAddPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ContactAddFragment delegated) {
			return delegated.providePresenter();
		}
	}
}
