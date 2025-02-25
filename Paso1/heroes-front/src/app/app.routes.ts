import { Routes } from '@angular/router';
import { LoginComponent } from './heroe/login/login.component';
import { authGuard } from './auth/auth.guard';
import { ListaHeroesComponent } from './heroe/lista-heroes/lista-heroes.component';
import { DetalleHeroeComponent } from './heroe/detalle-heroe/detalle-heroe.component';

export const routes: Routes = [
    {
        path: '', redirectTo: '/login', pathMatch: 'full'
    },
    {
        path: 'login', component: LoginComponent
    },
    {
        path: 'listado', component: ListaHeroesComponent // , canActivate: [authGuard]
    },
    {
        path: 'detalle-heroe', component: DetalleHeroeComponent, canActivate: [authGuard]
    }
];
