import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Veiculos} from '../model/veiculos';

@Injectable()
export class VeiculosService {
  private readonly veiculosUrl: string;

  constructor(private http: HttpClient) {
    this.veiculosUrl = 'http://localhost:8080/veiculos';
  }
  public findAll() {
    return this.http.get<Veiculos[]>(this.veiculosUrl);
  }
  public findById(id: number) {
    return this.http.get<Veiculos>(this.veiculosUrl + '/' + id);
  }
  public save(veiculo: Veiculos) {
    return this.http.post<Veiculos>(this.veiculosUrl, veiculo);
  }
  public update(veiculo: Veiculos) {
    return this.http.put<Veiculos>(this.veiculosUrl + '/' + veiculo.id, veiculo);
  }
  public delete(id: number) {
    return this.http.delete<Veiculos>(this.veiculosUrl + '/' + id);
  }
  public patch(id: number, veiculo: Veiculos) {
    return this.http.patch<Veiculos>(this.veiculosUrl + '/' + id, veiculo);
  }
}
