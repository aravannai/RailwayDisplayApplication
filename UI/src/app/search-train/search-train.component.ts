import { Component, OnInit } from '@angular/core';
import { TrainDataService } from '../service/data/train-data.service';
import { TrainDetails } from '../railway-dashboard/railway-dashboard.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-search-train',
  templateUrl: './search-train.component.html',
  styleUrls: ['./search-train.component.css']
})
export class SearchTrainComponent implements OnInit {

  trainName: string
  trainNumber: number
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  searchByTrainDetails(trainNumber, trainName){
    this.router.navigate(['trainDetails', trainNumber, trainName])
  }


}
