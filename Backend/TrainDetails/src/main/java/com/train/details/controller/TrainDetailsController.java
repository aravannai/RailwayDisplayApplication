package com.train.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.train.details.entity.TrainDetails;
import com.train.details.service.TrainDetailsService;

/**
 * This is the rest controller class which is being exposed as microservice
 * @author Sathish
 *
 */
@CrossOrigin(origins="http://localhost:8083")
@RestController
@RequestMapping("/api/trainDetails")
public class TrainDetailsController {

	@Autowired
	private TrainDetailsService trainDetailsService;
	
	@GetMapping("/listAllTrains")
	public List<TrainDetails> getAllRailwayDetails() {
		return trainDetailsService.getAllDetails();
	}
	
	@GetMapping("/searchByTrainDetails/trainNumber/{trainNumber}/trainName/{trainName}")
	public TrainDetails searchByTrainDetails(@PathVariable("trainNumber") int trainNumber, @PathVariable("trainName") String trainName) {
		return trainDetailsService.getByTrainDetails(trainNumber, trainName);
	}
	
}
