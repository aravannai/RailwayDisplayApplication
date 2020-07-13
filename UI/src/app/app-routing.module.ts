import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RailwayDashboardComponent } from './railway-dashboard/railway-dashboard.component';
import { RouteGuardService } from './service/route-guard.service';
import { LogoutComponent } from './logout/logout.component';
import { TrainDetailsComponent } from './train-details/train-details.component';
import { RegisterComponent } from './register/register.component';
import { ErrorComponent } from './error/error.component';
import { SearchTrainComponent } from './search-train/search-train.component';


const routes: Routes = [
  {path: '', component: LoginComponent },
  {path: 'login', component: LoginComponent },
  {path: 'railwayDashboard', component: RailwayDashboardComponent, canActivate: [RouteGuardService]},
  {path: 'logout', component: LogoutComponent},
  {path: 'searchByTrain/:trainNumber', component: SearchTrainComponent, canActivate:[RouteGuardService]},
  {path: 'searchByTrain/:trainName', component: SearchTrainComponent, canActivate:[RouteGuardService]},
  {path: 'trainDetails', component: TrainDetailsComponent, canActivate:[RouteGuardService]},
  {path: 'register', component: RegisterComponent, canActivate:[RouteGuardService]},
  {path: '**', component: ErrorComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
