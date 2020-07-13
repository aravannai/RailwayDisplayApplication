package com.train.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.details.entity.TrainDetails;
import com.train.details.respository.TrainDetailsRepository;

/**
 * THis is the class which holds the service layer of Train Details
 * @author Sathish
 *
 */
@Service
public class TrainDetailsService {

	@Autowired
	private TrainDetailsRepository trainDetailsRepository;
	
	public List<TrainDetails> getAllDetails() {
		return trainDetailsRepository.findAll();
	}

	public TrainDetails getByTrainDetails(int trainNumber, String trainName) {
		return trainDetailsRepository.findByTrainNumberAndTrainName(trainNumber,trainName);
	}

	

	

}
