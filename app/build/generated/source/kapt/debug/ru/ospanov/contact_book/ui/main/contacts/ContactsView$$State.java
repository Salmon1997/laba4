package ru.ospanov.contact_book.ui.main.contacts;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import java.lang.Override;
import java.util.List;
import ru.ospanov.contact_book.ui.main.contacts.adapters.ContactAdapterModel;

public class ContactsView$$State extends MvpViewState<ContactsView> implements ContactsView {
	@Override
	public void addDbContacts(List<ContactAdapterModel> contacts) {
		AddDbContactsCommand addDbContactsCommand = new AddDbContactsCommand(contacts);
		mViewCommands.beforeApply(addDbContactsCommand);

		if (hasNotView()) {
			return;
		}

		for (ContactsView view : mViews) {
			view.addDbContacts(contacts);
		}

		mViewCommands.afterApply(addDbContactsCommand);
	}

	@Override
	public void addPhoneContacts(List<ContactAdapterModel> contacts) {
		AddPhoneContactsCommand addPhoneContactsCommand = new AddPhoneContactsCommand(contacts);
		mViewCommands.beforeApply(addPhoneContactsCommand);

		if (hasNotView()) {
			return;
		}

		for (ContactsView view : mViews) {
			view.addPhoneContacts(contacts);
		}

		mViewCommands.afterApply(addPhoneContactsCommand);
	}

	@Override
	public void requestContactPermission() {
		RequestContactPermissionCommand requestContactPermissionCommand = new RequestContactPermissionCommand();
		mViewCommands.beforeApply(requestContactPermissionCommand);

		if (hasNotView()) {
			return;
		}

		for (ContactsView view : mViews) {
			view.requestContactPermission();
		}

		mViewCommands.afterApply(requestContactPermissionCommand);
	}

	public class AddDbContactsCommand extends ViewCommand<ContactsView> {
		public final List<ContactAdapterModel> contacts;

		AddDbContactsCommand(List<ContactAdapterModel> contacts) {
			super("addDbContacts", AddToEndSingleStrategy.class);

			this.contacts = contacts;
		}

		@Override
		public void apply(ContactsView mvpView) {
			mvpView.addDbContacts(contacts);
		}
	}

	public class AddPhoneContactsCommand extends ViewCommand<ContactsView> {
		public final List<ContactAdapterModel> contacts;

		AddPhoneContactsCommand(List<ContactAdapterModel> contacts) {
			super("addPhoneContacts", AddToEndSingleStrategy.class);

			this.contacts = contacts;
		}

		@Override
		public void apply(ContactsView mvpView) {
			mvpView.addPhoneContacts(contacts);
		}
	}

	public class RequestContactPermissionCommand extends ViewCommand<ContactsView> {
		RequestContactPermissionCommand() {
			super("requestContactPermission", SkipStrategy.class);
		}

		@Override
		public void apply(ContactsView mvpView) {
			mvpView.requestContactPermission();
		}
	}
}
