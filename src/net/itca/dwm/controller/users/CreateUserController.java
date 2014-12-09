package net.itca.dwm.controller.users;

import net.itca.dwm.controller.DataPanelController;
import net.itca.dwm.core.DineWithMeFacade;

public class CreateUserController {

	DineWithMeFacade facade;
	
	/**
	 * 
	 * @param dineWithMeFacade
	 */
	public CreateUserController(DineWithMeFacade dineWithMeFacade)
	{
		facade = dineWithMeFacade;
	}


	/**
	 * 
	 * @param username
	 * @param password
	 * @param first
	 * @param last
	 */
	public void createUser(String username, String password, String first, String last)
	{
		String encryptedPassword = facade.encrypt(password);
		try
		{
			facade.createUser(username, encryptedPassword, first, last);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
