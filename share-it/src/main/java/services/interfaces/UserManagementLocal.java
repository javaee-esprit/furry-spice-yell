package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import domain.User;

@Local
public interface UserManagementLocal {
	Boolean addUser(User user);

	Boolean deleteUser(Integer idUser);

	Boolean updateUser(User user);

	User findUserById(Integer idUser);

	Boolean deleteDetachedUser(User userDetached);

	List<User> findAllUsers();
}
