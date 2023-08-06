package com.asanaairtableintegration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String taskId;
    private String name;
    private String assignee;
    private String dueDate;
    private String description;

    // Constructors, getters, setters
}
