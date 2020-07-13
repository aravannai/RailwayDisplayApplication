import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_URL } from '../app.constants';
import { Router } from '@angular/router';

export class User{
  constructor(
    public firstName: string,
    public lastName: string,
    public mobile: number,
    public username: string,
    public password: string
  ){}
}

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  firstName: string
  lastName: string
  mobile: number
  username: string
  password: string
  invalidLogin = false
  message: string
  user: User

  errorMessage: 'Invalid credentials'
  
  constructor(private http: HttpClient, private router: Router) { }

  ngOnInit(): void {
  }

  saveUser(){
    return this.
    http.
    post<any>
    (`${API_URL}/api/registerUser`, this.user)
    .subscribe(response => {
      console.log(response);
        this.message=`Registeration of  ${this.user} successful!`;
        this.router.navigate(['railwayDashboard', this.user]);
    }
    )
  }

}
