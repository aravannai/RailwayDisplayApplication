import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { MenuComponent } from './menu/menu.component';
import { LoginComponent } from './login/login.component';
import { RailwayDashboardComponent } from './railway-dashboard/railway-dashboard.component';
import { LogoutComponent } from './logout/logout.component';
import { TrainDetailsComponent } from './train-details/train-details.component';
import { RegisterComponent } from './register/register.component';
import { ErrorComponent } from './error/error.component';
import { SearchTrainComponent } from './search-train/search-train.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    MenuComponent,
    LoginComponent,
    RailwayDashboardComponent,
    LogoutComponent,
    TrainDetailsComponent,
    RegisterComponent,
    ErrorComponent,
    SearchTrainComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
