import { TestBed } from '@angular/core/testing';

import { VeiculosServiceService } from './veiculos-service.service';

describe('VeiculosServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: VeiculosServiceService = TestBed.get(VeiculosServiceService);
    expect(service).toBeTruthy();
  });
});
