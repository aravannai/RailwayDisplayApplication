/**
 * 
 */
package com.message.activemq.db.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Sathish
 *
 */

@Document(collection="trainDetails")
public class TrainDetails implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer trainNumber;
	
	
	private String trainName;
	private Date arrivalTime;
	private Date departureTime;
	private String originStationCd;
	private String destinationStationCd;
	
	private List<String> currentLocation;
	
	public TrainDetails() {
		
	}
	
	public TrainDetails(Integer trainNumber, String trainName, Date arrivalTime, Date departureTime, String originStationCd,
			String destinationStationCd, List<String> currentLocation) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.originStationCd = originStationCd;
		this.destinationStationCd = destinationStationCd;
		this.currentLocation = currentLocation;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public String getOriginStationCd() {
		return originStationCd;
	}
	public void setOriginStationCd(String originStationCd) {
		this.originStationCd = originStationCd;
	}
	public String getDestinationStationCd() {
		return destinationStationCd;
	}
	public void setDestinationStationCd(String destinationStationCd) {
		this.destinationStationCd = destinationStationCd;
	}
	public List<String> getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(List<String> currentLocation) {
		this.currentLocation = currentLocation;
	}

	@Override
	public String toString() {
		return "TrainDetails [trainNumber=" + trainNumber + ", trainName=" + trainName + ", arrivalTime=" + arrivalTime
				+ ", departureTime=" + departureTime + ", originStationCd=" + originStationCd
				+ ", destinationStationCd=" + destinationStationCd + ", currentLocation=" + currentLocation + "]";
	}

	
	
}
