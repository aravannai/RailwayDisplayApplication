import { Component, OnInit } from '@angular/core';
import { TrainDataService } from '../service/data/train-data.service';
import { TrainDetails } from '../railway-dashboard/railway-dashboard.component';

@Component({
  selector: 'app-search-train',
  templateUrl: './search-train.component.html',
  styleUrls: ['./search-train.component.css']
})
export class SearchTrainComponent implements OnInit {

  trainDetails: TrainDetails
  trainName: string
  trainNumber: string
  constructor(private trainDataService: TrainDataService) { }

  ngOnInit(): void {
  }

  searchByTrainName(trainName){
    this.trainDataService.retrieveTrainByName(trainName).subscribe(
      response => this.trainDetails = response
    );
  }

  searchByTrainNumber(trainNumber){
    this.trainDataService.retrieveTrainByNumber(trainNumber).subscribe(
      response => this.trainDetails = response
    );
  }


}
