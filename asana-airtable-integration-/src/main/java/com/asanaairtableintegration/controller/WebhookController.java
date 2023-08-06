package com.asanaairtableintegration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asanaairtableintegration.service.AsanaService;

@RestController
public class WebhookController {

	@Autowired
	private AsanaService asanaService;

	@PostMapping("/asana-webhook")
	public ResponseEntity<String> handleAsanaWebhook(@RequestBody Task payload) {

		Task task = asanaService.processAsanaPayload(payload);
		boolean success = asanaService.addToAirtable(task);

		if (success) {
			return ResponseEntity.ok("Task added to Airtable successfully");
		} else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding task to Airtable");
		}

	}
}
