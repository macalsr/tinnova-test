package com.project.tinnova.service;

import com.project.tinnova.service.dto.VeiculoVO;
import com.project.tinnova.service.dto.VeiculosDTO;

import java.util.List;
import java.util.Map;

public interface VeiculosService {
    List<VeiculosDTO> findAll();

    List<VeiculosDTO> findAllBy(String q);

    VeiculosDTO findById(Integer id);

    VeiculosDTO save(VeiculoVO veiculoVO);

    VeiculosDTO update(Integer id, VeiculoVO veiculoVO);

    VeiculosDTO updateSome(Integer id, Map<Object, Object> fields);

    VeiculosDTO delete(Integer id);
}
