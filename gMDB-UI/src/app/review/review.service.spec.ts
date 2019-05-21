import { TestBed } from '@angular/core/testing';

import { ReviewService } from './review.service';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { RouterTestingModule } from '@angular/router/testing';



describe('ReviewService', () => {
  beforeEach(() => TestBed.configureTestingModule({
    imports:[HttpClientTestingModule, RouterTestingModule]
  }));

  it('should be created', () => {
    const service: ReviewService = TestBed.get(ReviewService);
    expect(service).toBeTruthy();
  });


});
