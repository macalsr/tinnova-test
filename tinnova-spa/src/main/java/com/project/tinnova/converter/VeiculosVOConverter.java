package com.project.tinnova.converter;

import com.project.tinnova.model.Veiculos;
import com.project.tinnova.service.dto.VeiculoVO;
import org.springframework.stereotype.Component;

@Component
public class VeiculosVOConverter implements Converter<Veiculos, VeiculoVO> {


    @Override
    public Veiculos converter(VeiculoVO veiculo) {
        return Veiculos.builder().ano(veiculo.getAno()).descricao(veiculo.getDescricao()).marca(veiculo.getMarca()).veiculo(veiculo.getVeiculo()).vendido(veiculo.getVendido()).build();
    }

    public Veiculos converter(Veiculos veiculo) {
        return Veiculos.builder().ano(veiculo.getAno()).descricao(veiculo.getDescricao()).marca(veiculo.getMarca()).veiculo(veiculo.getVeiculo()).vendido(veiculo.getVendido()).build();
    }


}
