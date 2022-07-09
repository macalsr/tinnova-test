import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {VeiculosListComponent} from './veiculos-list/veiculos-list.component';
import {VeiculoFormComponent} from './veiculo-form/veiculo-form.component';

const routes: Routes = [
  { path: 'veiculos', component: VeiculosListComponent },
  { path: 'addVeiculos', component: VeiculoFormComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
