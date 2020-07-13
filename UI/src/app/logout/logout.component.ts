import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HardcodedAutheticationService } from '../service/hardcoded-authetication.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private router: Router, private authentiationService: HardcodedAutheticationService) { }

  ngOnInit(): void {
    this.authentiationService.logout();
  }

  logBack(){
    this.router.navigate(['login'])
  }

}
