import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardcodedAutheticationService {

  constructor() { }

  
  authenticate(username, password){
    // console.log('Before'+this.isUserLoggedIn())
    if(username === 'sathish' && password === 'dummy'){
      sessionStorage.setItem('authenticateUser', username)
      // console.log('After'+this.isUserLoggedIn())
      return true;
    } 
    return false;
  }

  isUserLoggedIn(){
    let user = sessionStorage.getItem('authenticateUser')
    return !(user ===null)
  }

  logout(){
    sessionStorage.removeItem('authenticateUser');
  }
}
