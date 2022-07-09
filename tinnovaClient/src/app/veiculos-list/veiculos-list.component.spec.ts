import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VeiculosListComponent } from './veiculos-list.component';

describe('VeiculosListComponent', () => {
  let component: VeiculosListComponent;
  let fixture: ComponentFixture<VeiculosListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VeiculosListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VeiculosListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
