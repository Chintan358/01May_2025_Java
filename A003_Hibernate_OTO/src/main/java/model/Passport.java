package model;

import jakarta.persistence.*;


@Entity
@Table(name="passport")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="pass_number")
	String passport_number;
	
	@OneToOne(mappedBy = "passport",cascade = CascadeType.ALL)
	Person person;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassport_number() {
		return passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
