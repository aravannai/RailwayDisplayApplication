import { Injectable } from '@angular/core';
import { Router, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { HardcodedAutheticationService } from './hardcoded-authetication.service';

@Injectable({
  providedIn: 'root'
})
export class RouteGuardService {

  constructor(private authenticationService: HardcodedAutheticationService, private router: Router) { }
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    //throw new Error("Method not implemented.");
    if(this.authenticationService.isUserLoggedIn())
     return true
    
    this.router.navigate(['login'])
    return false
  }
}
