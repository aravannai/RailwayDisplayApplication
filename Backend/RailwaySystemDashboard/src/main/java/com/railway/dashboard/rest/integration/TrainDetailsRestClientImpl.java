package com.railway.dashboard.rest.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.railway.dashboard.entity.TrainDetails;

@Component
public class TrainDetailsRestClientImpl implements TrainDetailsRestClient{

	@Value("${com.train.details.rest.url}")
	private String TRAIN_DETAILS_STRING_URL;
	
	@Override
	public List<TrainDetails> getAllDetails() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		HttpEntity<?> httpEntity = new HttpEntity<>(headers);
		ResponseEntity<List<TrainDetails>> response = restTemplate
			       .exchange(TRAIN_DETAILS_STRING_URL + "/listAllTrains", HttpMethod.GET, httpEntity,  new ParameterizedTypeReference<List<TrainDetails>>() {
			 });
		return response.getBody();
	}

	@Override
	public TrainDetails findByTrainDetails(int trainNumber, String trainName) {
		RestTemplate restTemplate = new RestTemplate();
		
		TrainDetails trainDetails = restTemplate.getForObject(
							TRAIN_DETAILS_STRING_URL + 
							"/searchByTrainDetails/trainNumber/"
									+trainNumber+"/trainName/"
							+trainName, TrainDetails.class);
		return trainDetails;
	}

	

}
