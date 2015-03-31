package services.interfaces;

import javax.ejb.Remote;

@Remote
public interface YellManagementRemote {
	Boolean follow(Integer idCitizenOne, Integer idCitizenTow);
}
