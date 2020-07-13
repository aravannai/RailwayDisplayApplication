package com.railway.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.dashboard.entity.TrainDetails;
import com.railway.dashboard.rest.integration.TrainDetailsRestClient;

@RestController
@RequestMapping("/api")
public class RailwayDashboardController {

	
	@Autowired
	private TrainDetailsRestClient railwayDashboardService;
	
	@GetMapping("/listAllTrains")
	public List<TrainDetails> getAllRailwayDetails() {
		return railwayDashboardService.getAllDetails();
	}
	
	@GetMapping("/searchByTrainNumber/{trainNumber}")
	public TrainDetails searchByTrainNumber(@PathVariable("trainNumber") int trainNumber) {
		return railwayDashboardService.getByTrainNumber(trainNumber);
	}
	
	@GetMapping("/searchByTrainName/{trainName}")
	public TrainDetails searchByTrainName(@PathVariable("trainName") String trainName) {
		return railwayDashboardService.findByTrainName(trainName);
	}
}
