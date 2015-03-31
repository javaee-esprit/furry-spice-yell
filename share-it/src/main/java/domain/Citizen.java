package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Citizen
 *
 */
@Entity
public class Citizen extends User implements Serializable {

	private String address;
	private static final long serialVersionUID = 1L;

	private List<Citizen> citizensFollowers;

	public Citizen() {
		super();
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@ManyToMany
	public List<Citizen> getCitizensFollowers() {
		return citizensFollowers;
	}

	public void setCitizensFollowers(List<Citizen> citizensFollowers) {
		this.citizensFollowers = citizensFollowers;
	}

}
