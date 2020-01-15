package ru.ospanov.contact_book.ui.main.detail;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import java.lang.Override;
import ru.ospanov.contact_book.data.db.model.Contact;

public class ContactDetailView$$State extends MvpViewState<ContactDetailView> implements ContactDetailView {
	@Override
	public void setContact(Contact contact) {
		SetContactCommand setContactCommand = new SetContactCommand(contact);
		mViewCommands.beforeApply(setContactCommand);

		if (hasNotView()) {
			return;
		}

		for (ContactDetailView view : mViews) {
			view.setContact(contact);
		}

		mViewCommands.afterApply(setContactCommand);
	}

	public class SetContactCommand extends ViewCommand<ContactDetailView> {
		public final Contact contact;

		SetContactCommand(Contact contact) {
			super("setContact", AddToEndSingleStrategy.class);

			this.contact = contact;
		}

		@Override
		public void apply(ContactDetailView mvpView) {
			mvpView.setContact(contact);
		}
	}
}
