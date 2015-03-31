package services.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.UserManagementLocal;
import services.interfaces.YellManagementLocal;
import services.interfaces.YellManagementRemote;
import domain.Citizen;

/**
 * Session Bean implementation class YellManagement
 */
@Stateless
public class YellManagement implements YellManagementRemote,
		YellManagementLocal {

	@PersistenceContext
	private EntityManager entityManager;
	@EJB
	private UserManagementLocal userManagementLocal;

	/**
	 * Default constructor.
	 */
	public YellManagement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean follow(Integer idCitizenOne, Integer idCitizenTow) {
		Boolean b = false;
		try {
			Citizen citizenTow = (Citizen) userManagementLocal
					.findUserById(idCitizenTow);
			citizenTow.getCitizensFollowers().add(
					(Citizen) userManagementLocal.findUserById(idCitizenOne));

			userManagementLocal.updateUser(citizenTow);
			b = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return b;
	}

}
