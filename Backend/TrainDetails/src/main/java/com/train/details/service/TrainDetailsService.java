package com.train.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.details.entity.TrainDetails;
import com.train.details.respository.TrainDetailsRepository;

@Service
public class TrainDetailsService {



	@Autowired
	private TrainDetailsRepository trainDetailsRepository;
	
	public List<TrainDetails> getAllDetails() {
		// TODO Auto-generated method stub
		return trainDetailsRepository.findAll();
	}

	public TrainDetails getByTrainNumber(int trainNumber) {
		return trainDetailsRepository.findById(trainNumber).get();
	}
	
	public TrainDetails findByTrainName(String trainName) {
		return trainDetailsRepository.findByTrainName(trainName);
	}

	

}
