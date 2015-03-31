package domain;

import domain.User;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User implements Serializable {

	
	private String secretPass;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public String getSecretPass() {
		return this.secretPass;
	}

	public void setSecretPass(String secretPass) {
		this.secretPass = secretPass;
	}
   
}
