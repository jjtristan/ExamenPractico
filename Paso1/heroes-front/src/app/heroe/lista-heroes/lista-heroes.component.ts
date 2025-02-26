import { Component, inject, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HeroeService } from '../services/heroe.service';
import { AuthService } from '../../auth/auth.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-lista-heroes',
  imports: [CommonModule],
  templateUrl: './lista-heroes.component.html',
  styleUrl: './lista-heroes.component.scss'
})
export class ListaHeroesComponent implements OnInit {
  heroesService = inject(HeroeService);
  authService = inject(AuthService)
  router = inject(Router);
  heroes: any[] = [];

  ngOnInit(): void {
    this.heroesService.getCharacters().subscribe(data => {
      this.heroes = data;
    });
  }

  /**
   * Funcion para desloguearse
   */
  public logout() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

  /**
   * Ver el detalle del heroe
   */
  public verDetalle(idHeroe: number) {
    console.log("entre", idHeroe)
    this.router.navigate(['/detalle/' + idHeroe])
  }
}
