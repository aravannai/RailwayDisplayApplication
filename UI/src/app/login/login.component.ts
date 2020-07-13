import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BasicauthenticationService } from '../service/basicauthentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username='in28minutes'
  password = ''
  errorMessage: 'Invalid credentials'
  invalidLogin = false
  constructor(private router: Router, private basicAuthenticationService: BasicauthenticationService) { }

  ngOnInit(): void {
  }

  handleBasicAuthLogin(){
    this.basicAuthenticationService.executeAuthenticationService(this.username, this.password).subscribe
        (data => {
          this.router.navigate(['railwayDashboard', this.username])
          this.invalidLogin = false;
        }, error =>{
          console.log(error)
          this.invalidLogin = true;
        })
    }

    handleJWTAuthLogin(){
      this.basicAuthenticationService.executeJWTAuthenticationService(this.username, this.password).subscribe
          (data => {
            this.router.navigate(['welcome', this.username])
            this.invalidLogin = false;
          }, error =>{
            console.log(error)
            this.invalidLogin = true;
          })
      }
}
