package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {
  // JpaRepository gives pagination concept which CrudRepository not give
	
	
	
	
}
