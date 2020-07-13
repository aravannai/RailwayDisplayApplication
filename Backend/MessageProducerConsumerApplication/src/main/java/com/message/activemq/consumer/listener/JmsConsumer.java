package com.message.activemq.consumer.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.message.activemq.db.model.TrainDetails;
import com.message.activemq.db.repository.TrainDetailsRepository;

@Component
public class JmsConsumer {

	@Autowired
	TrainDetailsRepository trainDetailsRepository;

	@JmsListener(destination = "${jsa.activemq.queue}", containerFactory = "jsaFactory")
	public void receive(com.message.activemq.model.TrainDetails trainDetails) {
		System.out.println("Received Message: " + trainDetails);
		
		if(trainDetails.getCurrentLocation().get(0).equalsIgnoreCase(trainDetails.getOriginStationCd())) {
			trainDetailsRepository.save(new TrainDetails(
					trainDetails.getTrainNumber(), trainDetails.getTrainName(), 
					trainDetails.getArrivalTime(), trainDetails.getDepartureTime(), 
					trainDetails.getOriginStationCd(), trainDetails.getDestinationStationCd(),
					trainDetails.getCurrentLocation()));
		} else {
			TrainDetails updateTrainDetails = trainDetailsRepository.findById(trainDetails.getTrainNumber()).get();
			if(updateTrainDetails != null) {
				for(String currentInfo: trainDetails.getCurrentLocation()) {
					updateTrainDetails.getCurrentLocation().add(currentInfo);
				}
				trainDetailsRepository.save(updateTrainDetails);
			}
			
		}
		
	}
}