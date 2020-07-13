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
  trainDetails: TrainDetails
  errorMessage: string
  invalidValue = false
  constructor(private trainDataService: TrainDataService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.retrieveTrainDetails();
  }

  retrieveTrainDetails(){
    this.trainNumber = this.route.snapshot.params['trainNumber'];
    this.trainName = this.route.snapshot.params['trainName'];
      this.trainDataService.retrieveTrainDetails(this.trainNumber, this.trainName).subscribe(
        data => {
          this.trainDetails = data
          }, error =>{
            console.log(error);
            this.invalidValue = true
            this.errorMessage = "No valid values available"
          }
        );
  }
}
