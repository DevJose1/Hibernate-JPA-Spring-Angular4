package fr.devAtiq;

import java.sql.Date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.devAtiq.dao.ContactRepository;
import fr.devAtiq.entities.Contact;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		DateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");
		
		contactRepository.save(new Contact("atiq", "Youssef", dateFormat.parse("20/07/1987"), "atiq@gmail.com", 685984632, "ATIQ.jpg"));
		contactRepository.save(new Contact("atiq", "Yasmina",  dateFormat.parse("20/07/1990"),"atiqyasmina@gmail.com", 685984632, "ATIQ2.jpg"));
		contactRepository.save(new Contact("atiq", "Sophia",   dateFormat.parse("20/07/2017"),"atiqSophia@gmail.com", 685984632, "ATIQ3.jpg"));
		
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getName());
		});
	}
}
 