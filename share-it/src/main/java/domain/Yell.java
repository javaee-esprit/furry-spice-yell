package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Yell
 *
 */
@Entity
public class Yell implements Serializable {

	private Integer id;
	private Date dateOfYelling;
	private static final long serialVersionUID = 1L;

	private User user;

	public Yell() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateOfYelling() {
		return this.dateOfYelling;
	}

	public void setDateOfYelling(Date dateOfYelling) {
		this.dateOfYelling = dateOfYelling;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
