package userManagementTests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.interfaces.YellManagementRemote;

public class TestYellManagement {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		YellManagementRemote yellManagementRemote = (YellManagementRemote) context
				.lookup("/share-it/YellManagement!services.interfaces.YellManagementRemote");

		yellManagementRemote.follow(3, 1);

	}

}
