package fr.devAtiq.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import fr.devAtiq.dao.ContactRepository;
import fr.devAtiq.entities.Contact;

//service rest 
@RestController

public class ContactRestService {

	@Autowired
	private ContactRepository contactRepository;
	

	

}
