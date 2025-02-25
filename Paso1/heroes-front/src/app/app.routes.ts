import { Routes } from '@angular/router';
import { LoginComponent } from './heroe/login/login.component';
import { SignupComponent } from './heroe/signup/signup.component';
import { AdminComponent } from './heroe/admin/admin.component';
import { authGuard } from './auth/auth.guard';

export const routes: Routes = [
    {
        path: '', redirectTo: '/login', pathMatch: 'full'
    },
    {
        path: 'login', component: LoginComponent
    },
    {
        path: 'signup', component: SignupComponent
    },

    {
        path: 'admin', component: AdminComponent, canActivate: [authGuard]
    }
];
