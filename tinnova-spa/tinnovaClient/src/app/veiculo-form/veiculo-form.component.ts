import { Component} from '@angular/core';
import {Veiculos} from '../model/veiculos';
import {ActivatedRoute, Router} from '@angular/router';
import {VeiculosService} from '../service/veiculos-service.service';

@Component({
  selector: 'app-veiculo-form',
  templateUrl: './veiculo-form.component.html',
  styleUrls: ['./veiculo-form.component.css']
})
export class VeiculoFormComponent {

  veiculo: Veiculos;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private veiculoService: VeiculosService) {
    this.veiculo = new Veiculos();
  }

  onSubmit() {
    this.veiculoService.save(this.veiculo).subscribe(() => this.goToVeiculos());
  }

  goToVeiculos() {
    this.router.navigate(['/veiculos']);
  }
}
