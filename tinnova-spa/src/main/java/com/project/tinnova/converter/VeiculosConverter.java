package com.project.tinnova.converter;

import com.project.tinnova.model.Veiculos;
import com.project.tinnova.repository.VeiculosRepository;
import com.project.tinnova.service.dto.VeiculosDTO;
import com.project.tinnova.util.DateFormatUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class VeiculosConverter implements Converter<VeiculosDTO, Veiculos> {

    @Autowired
    VeiculosRepository veiculosRepository;

    @Override
    public VeiculosDTO converter(Veiculos veiculo) {
        return VeiculosDTO.builder().id(veiculo.getId()).ano(veiculo.getAno()).descricao(veiculo.getDescricao()).marca(veiculo.getMarca()).veiculo(veiculo.getVeiculo()).vendido(veiculo.getVendido())
                .created(DateFormatUtil.dateToString(veiculo.getCreated())).build();
    }

    public Veiculos converter(VeiculosDTO veiculoDTO) {
        return Veiculos.builder().id(veiculoDTO.getId()).ano(veiculoDTO.getAno()).descricao(veiculoDTO.getDescricao()).marca(veiculoDTO.getMarca()).veiculo(veiculoDTO.getVeiculo()).vendido(veiculoDTO.getVendido())
                .created(DateFormatUtil.stringToDate(veiculoDTO.getCreated())).build();
    }
    public Veiculos converterOptional(Veiculos veiculos, Integer id) {
        Optional<Veiculos> veiculo = veiculosRepository.findById(id);
        Veiculos veiculos1 = veiculo.get();
        if(veiculos.getVeiculo() != null) {
            veiculos1.setVeiculo(veiculos.getVeiculo());
        }
        if(veiculos.getVendido() != null){
            veiculos1.setVendido(veiculos.getVendido());
        }
        if(veiculos.getMarca() != null){
            veiculos1.setMarca(veiculos.getMarca());
        }
        if(veiculos.getAno() != null) {
            veiculos1.setAno(veiculos.getAno());
        }
        if(veiculos.getDescricao() != null) {
            veiculos1.setDescricao(veiculos.getDescricao());
        }
        return veiculos1;
    }

}
