package com.message.activemq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.message.activemq.model.TrainDetails;
import com.message.activemq.producer.JmsProducer;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ActiveMQController {

	@Autowired
	JmsProducer producer;
	
	@GetMapping("/trainDetails")
	public ResponseEntity<String> publish(@RequestBody TrainDetails trainDetails){
		producer.send(trainDetails);
		return new ResponseEntity<String>("success", HttpStatus.OK);
	}
}
