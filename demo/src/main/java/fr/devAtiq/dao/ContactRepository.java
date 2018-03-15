package fr.devAtiq.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.devAtiq.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

	//List<Contact> findByName(String name);
	
}
