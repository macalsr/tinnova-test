import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import {VeiculosListComponent} from './veiculos-list/veiculos-list.component';
import {VeiculoFormComponent} from './veiculo-form/veiculo-form.component';
import {VeiculosService} from './service/veiculos-service.service';
import { VeiculosUpdateComponent } from './veiculos-update/veiculos-update.component';

@NgModule({
  declarations: [
    AppComponent,
    VeiculosListComponent,
    VeiculoFormComponent,
    VeiculosUpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [VeiculosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
