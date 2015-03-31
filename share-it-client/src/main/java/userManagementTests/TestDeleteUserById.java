package userManagementTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.UserManagementRemote;

public class TestDeleteUserById {
	public static void main(String[] args) throws NamingException {

		Context context = new InitialContext();
		UserManagementRemote proxy = (UserManagementRemote) context
				.lookup("/share-it/UserManagement!services.interfaces.UserManagementRemote");

		System.out.println(proxy.deleteUser(1));
	}
}
