package net.itca.dwm.controller;

import net.itca.dwm.view.LoginHomePanel;
import net.itca.dwm.view.MainView;

public class DataPanelController {
	/**
	 * Opens the main menu for a logged-in user.
	 */
	public void navigateMenu()
	{
		LoginHomePanel loginHome = new LoginHomePanel(new LoginHomeController());
		MainView mainView = MainView.getMainView();
		mainView.setMainPanel(loginHome);
	}
}
