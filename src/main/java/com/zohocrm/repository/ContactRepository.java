package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
  // JpaRepository gives pagination concept which CrudRepository not give
	
	
	
	
}
