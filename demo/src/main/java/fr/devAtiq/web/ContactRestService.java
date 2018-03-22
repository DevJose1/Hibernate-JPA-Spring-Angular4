package fr.devAtiq.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.devAtiq.dao.ContactRepository;
import fr.devAtiq.entities.Contact;


@RestController
@CrossOrigin("*")
public class ContactRestService {

	@Autowired
	private ContactRepository contactRepository;
	
	
	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public  java.util.List<Contact> getContact(){
		return contactRepository.findAll();
	}
	@RequestMapping(value="/contact/{id}", method=RequestMethod.GET)
	public  Contact getContact(@PathVariable Long id){
		return contactRepository.findOne(id);
	
	}
	
	public  Page<Contact> searchContact(@RequestParam(name="mc", defaultValue="") String mc,
			@RequestParam(name="page", defaultValue="0") int page,
			@RequestParam(name="size", defaultValue="2") int size ){
		return contactRepository.searchContact(mc, new PageRequest(page, size));
		
	}
	
	//to add contact
	@RequestMapping(value="/contact/", method=RequestMethod.POST)
	public  Contact save(@RequestBody Contact c){
		return contactRepository.save(c);
	}
	
	@RequestMapping(value="/contact/{id}", method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id){
		 contactRepository.delete(id);
		 return true;
	}
	
	@RequestMapping(value="/contact/{id}", method=RequestMethod.PUT)
 
	public Contact save(@PathVariable Long id, @RequestBody Contact c) {
		c.setId(id);
		
		return  contactRepository.save(c);
		
	}
			
		 
		

	

}

