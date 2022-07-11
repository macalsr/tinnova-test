package com.project.tinnova.tinnova.teste.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.project.tinnova.converter.VeiculosConverter;
import com.project.tinnova.converter.VeiculosVOConverter;
import com.project.tinnova.model.Veiculos;
import com.project.tinnova.repository.VeiculosRepository;
import com.project.tinnova.service.dto.VeiculoVO;
import com.project.tinnova.service.dto.VeiculosDTO;
import com.project.tinnova.service.impl.VeiculosServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/** 
* VeiculosServiceImpl Tester. 
* 
* @author <maria.ribeiro>
* @since <pre>jul 9, 2022</pre> 
* @version 1.0 
*/
@ExtendWith(MockitoExtension.class)
public class VeiculosServiceImplTest {

    @InjectMocks
    VeiculosServiceImpl veiculosService;

    @Mock
    VeiculosRepository veiculosRepository;
    @Mock
    VeiculosConverter veiculosConverter;
    VeiculosDTO veiculosDTO;

    Veiculos veiculos;

    VeiculoVO veiculoVO;
    @Mock
    VeiculosVOConverter veiculoVOConverter;

    @BeforeEach
    public void init() {
        veiculos = new Veiculos(1, "veiculo", "marca", 2016, "descricao", true, new Date(), new Date());
        veiculosDTO = new VeiculosDTO( 1,"veiculo", "marca", 2000, "descricao", true, new Date().toString(), new Date().toString());
        veiculoVO = new VeiculoVO("veiculo", "marca", 2000, "descricao", true);
    }

    @Test
    void testBuscarPorId() {
        veiculosRepository.findById(1);
                veiculosService = new VeiculosServiceImpl(veiculosRepository, veiculosConverter, veiculoVOConverter);
        assertEquals( veiculosRepository.findById(1), Optional.empty());
    }

    @Test
    void testbuscarpor() {
            veiculosRepository.findAllBy(null);
                    veiculosService = new VeiculosServiceImpl(veiculosRepository, veiculosConverter, veiculoVOConverter);
        assertEquals(veiculosRepository.findAllBy(null), Collections.emptyList());
    }
    @Test
    void testBuscarTodos(){
                veiculosService = new VeiculosServiceImpl(veiculosRepository, veiculosConverter, veiculoVOConverter);
        assertEquals(veiculosService.findAll(), Collections.emptyList());
    }

    @Test
    void testeSalvar() {
        when(veiculosRepository.save(veiculos)).thenReturn(veiculos);
        when(veiculosConverter.converter(veiculosDTO)).thenReturn(veiculos);
        when(veiculosService.save(veiculoVO)).thenReturn(veiculosDTO);
        VeiculosDTO veiculos1 = veiculosService.save(veiculoVO);
        assertEquals(veiculos1, veiculosDTO);
        }

    @Test
    void testUpdate() {
        assertEquals(veiculosService.update(1,veiculoVO), veiculosDTO);
    }
    @Test
    public void givenANode_whenConvertingIntoAnObject_thenCorrect() {
        ObjectMapper mapper = new ObjectMapper();
        Integer id = 3;
        Map<Object,Object> fields = new HashMap<>();
        fields.put("ano", "2016");
        Veiculos veiculos1 = new Veiculos();
        veiculos1.setAno(2016);
        assertEquals(2016, veiculos.getAno());
    }
}
