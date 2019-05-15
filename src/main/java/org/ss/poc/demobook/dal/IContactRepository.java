package org.ss.poc.demobook.dal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.ss.poc.demobook.domain.Contact;

import java.util.Collection;

@RepositoryRestResource(path = "contacts-list", collectionResourceRel = "items", itemResourceRel = "item")
public interface IContactRepository extends CrudRepository<Contact, Long> {
	
	@RestResource(path = "by-email")
	public Contact findByEmail( @Param("email") String email );
	
	@RestResource(path = "by-name")
	public Collection<Contact> findByLastName(@Param( "name" ) String lastName);

}
