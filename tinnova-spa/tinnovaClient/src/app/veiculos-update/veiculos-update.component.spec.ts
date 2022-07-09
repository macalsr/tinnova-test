import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VeiculosUpdateComponent } from './veiculos-update.component';

describe('VeiculosUpdateComponent', () => {
  let component: VeiculosUpdateComponent;
  let fixture: ComponentFixture<VeiculosUpdateComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VeiculosUpdateComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VeiculosUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
