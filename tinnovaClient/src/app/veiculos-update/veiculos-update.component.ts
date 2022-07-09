import { Component} from '@angular/core';
import {Veiculos} from '../model/veiculos';
import {ActivatedRoute, Router} from '@angular/router';
import {VeiculosService} from '../service/veiculos-service.service';

@Component({
  selector: 'app-veiculo-update',
  templateUrl: './veiculos-update.component.html',
  styleUrls: ['./veiculos-update.component.css']
})
export class VeiculosUpdateComponent {

  veiculo: Veiculos;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private veiculoService: VeiculosService) {
    this.veiculo = new Veiculos();
  }

  onSubmit() {
    this.veiculoService.update(this.veiculo).subscribe(() => this.goToVeiculos());
  }

  goToVeiculos() {
    this.router.navigate(['/veiculos']);
  }

}
