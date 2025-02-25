import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaHeroesComponent } from './lista-heroes.component';

describe('ListaHeroesComponent', () => {
  let component: ListaHeroesComponent;
  let fixture: ComponentFixture<ListaHeroesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ListaHeroesComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListaHeroesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
