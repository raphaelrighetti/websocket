package com.raphaelrighetti.websocket.controllers.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raphaelrighetti.websocket.models.records.ChosenChat;
import com.raphaelrighetti.websocket.services.PickChatService;

@RestController
@RequestMapping("/rest/pick-chat")
public class PickChatController {

	@Autowired
	private PickChatService service;
	
	@GetMapping
	public ResponseEntity<ChosenChat> pickAvailableChat() {
		return ResponseEntity.ok(service.pickChat());
	}
	
}
