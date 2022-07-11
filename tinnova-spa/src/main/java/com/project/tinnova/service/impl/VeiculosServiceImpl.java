package com.project.tinnova.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.tinnova.converter.VeiculosConverter;
import com.project.tinnova.converter.VeiculosVOConverter;
import com.project.tinnova.model.Veiculos;
import com.project.tinnova.repository.VeiculosRepository;
import com.project.tinnova.service.VeiculosService;
import com.project.tinnova.service.dto.VeiculoVO;
import com.project.tinnova.service.dto.VeiculosDTO;
import com.project.tinnova.util.DateFormatUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Slf4j
@Service
@Transactional
public class VeiculosServiceImpl implements VeiculosService {

    private final VeiculosRepository veiculoRepository;
    private final VeiculosConverter veiculoConverter;
    private final VeiculosVOConverter veiculoVOConverter;

    public VeiculosServiceImpl(VeiculosRepository veiculoRepository, VeiculosConverter veiculoConverter, VeiculosVOConverter veiculoVOConverter) {
        this.veiculoRepository = veiculoRepository;
        this.veiculoConverter = veiculoConverter;
        this.veiculoVOConverter = veiculoVOConverter;
    }


    public List<VeiculosDTO> findAll() {
        List<Veiculos> veiculo = veiculoRepository.findAll();
        List<VeiculosDTO> veiculoDTOList = new ArrayList<>();
        for (Veiculos v : veiculo) {
            VeiculosDTO veiculoDTO = veiculoConverter.converter(v);
            veiculoDTOList.add(veiculoDTO);
        }
        return veiculoDTOList;
    }

    public List<VeiculosDTO> findAllBy(String q) {
        List<Veiculos> veiculo = veiculoRepository.findAllBy(q);
        List<VeiculosDTO> veiculoDTOList = new ArrayList<>();
        for (Veiculos v : veiculo) {
            VeiculosDTO veiculoDTO = veiculoConverter.converter(v);
            veiculoDTOList.add(veiculoDTO);
        }
        return veiculoDTOList;
    }

    public VeiculosDTO findById(Integer id) {
        Veiculos veiculo = veiculoRepository.findById(id).orElseThrow(() -> new RuntimeException("Veiculo não existe."));
        return veiculoConverter.converter(veiculo);
    }

    public VeiculosDTO save(VeiculoVO veiculoVO) {
        Veiculos veiculos = veiculoVOConverter.converter(veiculoVO);
        Date dtCriacao = new Date();
        veiculos.setCreated(dtCriacao);
        veiculoRepository.save(veiculos);
        return veiculoConverter.converter(veiculos);
    }

    public VeiculosDTO update(Integer id, VeiculoVO veiculoVO) {
        try {
            Optional<Veiculos> veiculo = veiculoRepository.findById(id);
            VeiculosDTO veiculosDTO = veiculoConverter.converter(veiculo.get());
            Date dtUpdated = new Date();
            veiculo.get().setUpdated(dtUpdated);
            veiculoRepository.save(veiculo.get());
            veiculosDTO.setUpdated(DateFormatUtil.dateToString(dtUpdated));
            return veiculosDTO;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public VeiculosDTO updateSome(Integer id, Map<Object, Object> fields) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Veiculos veiculos = mapper.convertValue(fields, Veiculos.class);
            Veiculos veiculos1 = veiculoConverter.converterOptional(veiculos, id);
            Date dtUpdated = new Date();
            veiculos1.setUpdated(dtUpdated);
            VeiculosDTO veiculosDTO1 = veiculoConverter.converter(veiculos1);
            veiculoRepository.save(veiculos1);
            veiculosDTO1.setUpdated(DateFormatUtil.dateToString(dtUpdated));
            return veiculosDTO1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public VeiculosDTO delete(Integer id) {
        Optional<Veiculos> veiculo = veiculoRepository.findById(id);
        if (veiculo.isPresent()) {
            try {
                veiculo.ifPresent(veiculoRepository::delete);
            } catch (Exception e) {
                log.error("Erro ao atualizar veiculo: " + e.getMessage());
            }
        }
        return veiculo.map(veiculoConverter::converter).orElse(null);
    }

}
;
