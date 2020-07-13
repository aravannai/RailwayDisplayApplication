import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RailwayDashboardComponent } from './railway-dashboard.component';

describe('RailwayDashboardComponent', () => {
  let component: RailwayDashboardComponent;
  let fixture: ComponentFixture<RailwayDashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RailwayDashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RailwayDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
