import { Component, OnInit } from '@angular/core';
import { TrainDetails } from '../railway-dashboard/railway-dashboard.component';
import { TrainDataService } from '../service/data/train-data.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-train-details',
  templateUrl: './train-details.component.html',
  styleUrls: ['./train-details.component.css']
})
export class TrainDetailsComponent implements OnInit {
  trainNumber: number
  trainName: string
  trains: TrainDetails
  constructor(private trainDataService: TrainDataService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {

  }

  retrieveTrainDetailsByNumber(){
    this.trainNumber = this.route.snapshot.params['trainNumber'];
    this.trains = new TrainDetails(this.trainNumber, '', new Date(), new Date(), '', '', [''])
    if(this.trainNumber !=-1){
      this.trainDataService.retrieveTrainByNumber(this.trainNumber).subscribe(
        data => {
          this.trains = data
          this.router.navigate(['trainDetails'])
        }
        );
    }
  }

  retrieveTrainDetailsByName(){
    this.trainName = this.route.snapshot.params['trainName'];
    this.trains = new TrainDetails(-1, this.trainName, new Date(), new Date(), '', '', [''])
    if(this.trainName != null){
      this.trainDataService.retrieveTrainByName(this.trainName).subscribe(
        data => {
          this.trains = data
          this.router.navigate(['trainDetails'])
        }
      );
    }
  }
}
