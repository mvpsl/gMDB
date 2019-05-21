import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ReviewFormComponent } from './review-form.component';
import {  ReactiveFormsModule,FormsModule } from '@angular/forms';


describe('ReviewFormComponent', () => {
  let component: ReviewFormComponent;
  let fixture: ComponentFixture<ReviewFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ReviewFormComponent ],
      imports:[ReactiveFormsModule,FormsModule]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ReviewFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
