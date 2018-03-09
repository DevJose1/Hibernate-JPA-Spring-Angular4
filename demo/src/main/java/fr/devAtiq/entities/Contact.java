package fr.devAtiq.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Contact implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String firstName;
	
	@Basic
	@Temporal(TemporalType.DATE)
	private java.util.Date DateOfBirth;
	private String email;
	private long phone;
	private String image;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getDateOfBirth() {
		return (Date) DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String firstName2, java.util.Date parse, String email, int phone, String image) {
		super();
		this.name = name;
		this.firstName = firstName;
		DateOfBirth = getDateOfBirth();
		this.email = email;
		this.phone = phone;
		this.image = image;

		
	}
	
	
	
	

}
