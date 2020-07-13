import { Component, OnInit } from '@angular/core';
import { TrainDataService } from '../service/data/train-data.service';

export class TrainDetails{
  constructor(
    public trainNumber: number,
    public trainName: string,
    public arrivalTime: Date,
    public departureTime: Date,
    public originStationCd: string,
    public destinationStationCd: string,
    public currentLocation: string[]
  ){

  }
}

@Component({
  selector: 'app-railway-dashboard',
  templateUrl: './railway-dashboard.component.html',
  styleUrls: ['./railway-dashboard.component.css']
})
export class RailwayDashboardComponent implements OnInit {

  trainDetails: TrainDetails[]
  message: string
  constructor(private trainDataService: TrainDataService) { }

  ngOnInit(): void {
    this.refreshTrainDetails();
  }

  refreshTrainDetails(){
    this.trainDataService.retrieveAllTrains().subscribe(
      response => {
        console.log(response);
        this.trainDetails = response;
      }
    );
  }

}
