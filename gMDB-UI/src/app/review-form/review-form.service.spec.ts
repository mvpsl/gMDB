import { TestBed } from '@angular/core/testing';

import { ReviewFormService } from './review-form.service';

describe('ReviewFormService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ReviewFormService = TestBed.get(ReviewFormService);
    expect(service).toBeTruthy();
  });
});
