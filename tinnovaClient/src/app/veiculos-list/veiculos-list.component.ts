import { Component, OnInit } from '@angular/core';
import {Veiculos} from '../model/veiculos';
import {VeiculosService} from '../service/veiculos-service.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-veiculos-list',
  templateUrl: './veiculos-list.component.html',
  styleUrls: ['./veiculos-list.component.css']
})
export class VeiculosListComponent implements OnInit {
  veiculos: Veiculos[];
  constructor(private veiculoService: VeiculosService,
              private router: Router) { }

  ngOnInit() {
    this.veiculoService.findAll().subscribe(data => {
      this.veiculos = data;
    });
  }

  delete(id: number) {
    this.veiculoService.delete(id).subscribe(
      data => {
        console.log(data);
        this.ngOnInit();
      }
    );
  }

  update() {
    this.router.navigate(['/updateVeiculo']);
  }
}
