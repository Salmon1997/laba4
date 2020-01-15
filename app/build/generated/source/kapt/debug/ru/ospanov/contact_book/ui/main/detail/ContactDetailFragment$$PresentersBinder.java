package ru.ospanov.contact_book.ui.main.detail;

import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.PresenterBinder;
import com.arellomobile.mvp.presenter.PresenterField;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;

public class ContactDetailFragment$$PresentersBinder extends PresenterBinder<ContactDetailFragment> {
	@Override
	public List<PresenterField<ContactDetailFragment>> getPresenterFields() {
		List<PresenterField<ContactDetailFragment>> presenters = new ArrayList<>(1);
		presenters.add(new presenterBinder());
		return presenters;
	}

	public class presenterBinder extends PresenterField<ContactDetailFragment> {
		public presenterBinder() {
			super("presenter", null, ContactDetailPresenter.class);
		}

		@Override
		public void bind(ContactDetailFragment target, MvpPresenter presenter) {
			target.presenter = (ContactDetailPresenter) presenter;
		}

		@Override
		public MvpPresenter<?> providePresenter(ContactDetailFragment delegated) {
			return delegated.providePresenter();
		}
	}
}
