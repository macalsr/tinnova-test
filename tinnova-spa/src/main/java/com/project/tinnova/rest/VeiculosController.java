package com.project.tinnova.rest;

import com.project.tinnova.service.VeiculosService;
import com.project.tinnova.service.dto.VeiculoVO;
import com.project.tinnova.service.dto.VeiculosDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@Controller
@RequestMapping("/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosService veiculoService;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<VeiculosDTO>> findAll() {
        return ResponseEntity.ok(veiculoService.findAll());
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<List<VeiculosDTO>> findAllBy(String q) {
        return ResponseEntity.ok(veiculoService.findAllBy(q));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<VeiculosDTO> findById(@Param("id") Integer id) {
        return ResponseEntity.ok(veiculoService.findById(id));
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<?> save(VeiculoVO veiculoVO) {
        return ResponseEntity.ok(veiculoService.save(veiculoVO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Integer id, @RequestBody VeiculoVO veiculoVO){
        return ResponseEntity.ok(veiculoService.update(id,veiculoVO));
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<?> updateSome(@PathVariable("id") Integer id, @RequestBody Map<Object, Object> fields) {

        return ResponseEntity.ok(veiculoService.updateSome( id, fields));
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(veiculoService.delete(id));
    }
}
