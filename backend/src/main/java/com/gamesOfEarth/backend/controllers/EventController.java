package com.gamesOfEarth.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesOfEarth.backend.entitybeans.Event;
import com.gamesOfEarth.backend.services.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService eventService;
	@GetMapping("/get-event")
	public List<Event> getAllEvents(){
		return eventService.getAllEvents();
	}
	
}