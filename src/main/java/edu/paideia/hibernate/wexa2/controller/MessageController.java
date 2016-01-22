package edu.paideia.hibernate.wexa2.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.paideia.hibernate.wexa2.model.Message;
import edu.paideia.hibernate.wexa2.service.MessageService;

@RestController
public class MessageController {
	
	@Autowired
	private MessageService service;
	
	@RequestMapping(value="/messages", method=RequestMethod.GET)
	public Collection<Message> getEmpleados(){
		return service.findAll();
	}
}
