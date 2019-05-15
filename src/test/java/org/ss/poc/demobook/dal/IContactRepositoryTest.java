package org.ss.poc.demobook.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.DisabledIf;
import org.springframework.test.context.junit4.SpringRunner;
import org.ss.poc.demobook.DemoBookApplication;
import org.ss.poc.demobook.domain.Contact;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith( SpringRunner.class )
@SpringBootTest(classes = DemoBookApplication.class )
public class IContactRepositoryTest {
	
	@Autowired
	IContactRepository dao;
	
	@Test
	public void save() {
		
		Contact contact = new Contact( "SYLLA", "L", "s.l@ss.org" );
		Contact contactSaved = dao.save( contact );
		assertThat( contact.getEmail(), is(contact.getEmail()) );
	}
	
	@Test
	public void findByEmail() {
		Contact contact = new Contact( "SYLLA", "E", "s.e@ss.org" );
		
		assertThat( dao.save( contact ).getEmail(), is(dao.findByEmail( "s.e@ss.org").getEmail()) );
	}
	
}