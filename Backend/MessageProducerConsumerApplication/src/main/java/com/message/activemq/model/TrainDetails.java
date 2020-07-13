/**
 * 
 */
package com.message.activemq.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Sathish
 *
 */
public class TrainDetails implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int trainNumber;
	private String trainName;
	private Date arrivalTime;
	private Date departureTime;
	private String originStationCd;
	private String destinationStationCd;
	
	private List<String> currentLocation;
	
	public TrainDetails() {
		
	}
	
	public TrainDetails(int trainNumber, String trainName, Date arrivalTime, Date departureTime, String originStationCd,
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
		JSONObject jsonInfo = new JSONObject();
	    
		try {
			jsonInfo.put("name", this.trainName);
			jsonInfo.put("number", this.trainNumber);
			jsonInfo.put("arrivalTime", this.arrivalTime);
			jsonInfo.put("departureTime", this.departureTime);
			jsonInfo.put("originStation", this.originStationCd);
			jsonInfo.put("destinationStation", this.destinationStationCd);

			JSONArray locationArray = new JSONArray();
			if (this.currentLocation != null) {
				this.currentLocation.forEach(location -> {
					JSONObject subJson = new JSONObject();
					try {
						subJson.put("currentLocation", location);
					} catch (JSONException e) {
					}

					locationArray.put(subJson);
				});
			}
			jsonInfo.put("trainDetails", locationArray);
		} catch (JSONException e1) {}
		
		return jsonInfo.toString();
	}
	
	
}
