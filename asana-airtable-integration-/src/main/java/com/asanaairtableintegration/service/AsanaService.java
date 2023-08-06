package com.asanaairtableintegration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asanaairtableintegration.model.Task;
import com.asanaairtableintegration.repo.TaskRepo;

@Service
public class AsanaService {

    @Autowired
    private AirtableService airtableService;
    
    @Autowired
    private TaskRepo tRepo;

    public org.springframework.scheduling.config.Task processAsanaPayload(org.springframework.scheduling.config.Task payload) {
	
	org.springframework.scheduling.config.Task t =	tRepo.save(payload);
        // Parse payload and extract task information
        // Create a Task object and return it
		return t;
    }

    public boolean addToAirtable(org.springframework.scheduling.config.Task task) {
		return false;
        // Call Airtable API using airtableService to add a new row
        // Return true if successful, false otherwise
    }

}
