import { Component, inject, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { HeroeService } from '../services/heroe.service';
import { AuthService } from '../../auth/auth.service';

@Component({
  selector: 'app-detalle-heroe',
  imports: [],
  templateUrl: './detalle-heroe.component.html',
  styleUrl: './detalle-heroe.component.scss'
})
export class DetalleHeroeComponent implements OnInit {
  id!: number;
  heroeDetalle: any;
  authService = inject(AuthService)
  router = inject(Router);

  constructor(private activeRouter: ActivatedRoute, private heroesService: HeroeService) {
    this.activeRouter.params.subscribe((params: Params) => {
      this.id = params["id"];
    });
    this.heroesService.getCharacterDetail(this.id).subscribe(data => {
      this.heroeDetalle = data;
    });
  }

  ngOnInit(): void {
  }

  /**
   * Funcion para desloguearse
   */
  public logout() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

  /**
   * Nos regrea a la pagina de listado
   */
  public retorno() {
    window.history.back();
  }

}
