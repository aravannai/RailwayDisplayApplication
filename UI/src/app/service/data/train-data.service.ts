import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TrainDetails } from 'src/app/railway-dashboard/railway-dashboard.component';
import { API_URL } from 'src/app/app.constants';

@Injectable({
  providedIn: 'root'
})
export class TrainDataService {

  constructor(private http: HttpClient) { }

  retrieveAllTrains(){
    return this.http.get<TrainDetails[]>(`${API_URL}/api/listAllTrains`)
  }
  retrieveTrainDetails(trainNumber, trainName){
    return this.http.get<TrainDetails>(`${API_URL}/api/searchByTrainDetails/trainNumber/${trainNumber}/trainName/${trainName}`)
  }

  
}
