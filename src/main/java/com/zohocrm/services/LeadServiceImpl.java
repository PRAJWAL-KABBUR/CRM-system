package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entity.Lead;
import com.zohocrm.repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;   
	// Constructor based injection also possible for 'BEAN' creation
	
	@Override
	public void saveOneLead(Lead lead) {
		
		leadRepo.save(lead);
		
	}

	@Override
	public Lead getLeadById(long id) {

		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
		
	}

	@Override
	public void deleteLeadById(long id) {
		
		leadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}

}
