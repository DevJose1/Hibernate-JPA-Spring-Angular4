package fr.devAtiq.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.devAtiq.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

	
	//add a method to search for contacts
	@Query("select c from Contact c where c.name like :x")
	public Page<Contact> searchContact(@Param("x") String mc, Pageable pageable);
	
	
}
