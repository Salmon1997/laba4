package ru.ospanov.contact_book.ui.main.add;

import com.arellomobile.mvp.viewstate.MvpViewState;
import com.arellomobile.mvp.viewstate.ViewCommand;
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy;
import java.lang.Override;
import java.lang.String;

public class ContactAddView$$State extends MvpViewState<ContactAddView> implements ContactAddView {
	@Override
	public void showToast(String text) {
		ShowToastCommand showToastCommand = new ShowToastCommand(text);
		mViewCommands.beforeApply(showToastCommand);

		if (hasNotView()) {
			return;
		}

		for (ContactAddView view : mViews) {
			view.showToast(text);
		}

		mViewCommands.afterApply(showToastCommand);
	}

	public class ShowToastCommand extends ViewCommand<ContactAddView> {
		public final String text;

		ShowToastCommand(String text) {
			super("showToast", OneExecutionStateStrategy.class);

			this.text = text;
		}

		@Override
		public void apply(ContactAddView mvpView) {
			mvpView.showToast(text);
		}
	}
}
