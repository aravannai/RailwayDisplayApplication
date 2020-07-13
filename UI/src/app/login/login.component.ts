import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BasicauthenticationService } from '../service/basicauthentication.service';
import { HardcodedAutheticationService } from '../service/hardcoded-authetication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username=''
  password = ''
  errorMessage: 'Invalid credentials'
  invalidLogin = false
  constructor(private router: Router, private authenticationService: HardcodedAutheticationService, private basicAuthenticationService: BasicauthenticationService) { }

  ngOnInit(): void {
  }

  handleLogin() {
    //console.log(this.password);
    console.log(this.invalidLogin);
      //if(this.username === 'in28minutes' && this.password === 'dummy'){
      if(this.authenticationService.authenticate(this.username, this.password)){
        this.router.navigate(['railwayDashboard'])
        this.invalidLogin = false;
      } else{
        this.invalidLogin = true;
      }
  }

  // handleBasicAuthLogin(){
  //   this.basicAuthenticationService.executeAuthenticationService(this.username, this.password).subscribe
  //       (data => {
  //         this.router.navigate(['railwayDashboard', this.username])
  //         this.invalidLogin = false;
  //       }, error =>{
  //         console.log(error)
  //         this.invalidLogin = true;
  //       })
  //   }

  //   handleJWTAuthLogin(){
  //     this.basicAuthenticationService.executeJWTAuthenticationService(this.username, this.password).subscribe
  //         (data => {
  //           this.router.navigate(['welcome', this.username])
  //           this.invalidLogin = false;
  //         }, error =>{
  //           console.log(error)
  //           this.invalidLogin = true;
  //         })
  //     }
}
