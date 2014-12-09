package net.itca.dwm.core;

public class ActiveSession {

	private static ActiveSession session;
	private User currentUser;
	private ActiveSession()
	{
		
	}
	
	/**
	 * Returns an existing active session, or returns a new one in case there was none.
	 * @return
	 */
	public static ActiveSession getActiveSession()
	{
		if(session==null)
		{
			session = new ActiveSession();
		}
		return session;
	}
	
	/**
	 * Sets the current user.
	 * @param current
	 */
	public void setCurrentUser(User current)
	{
		currentUser = current;
	}
	
	/**
	 * Returns the current user
	 * @return
	 */
	public User getCurrentUser()
	{
		return currentUser;
	}
}
