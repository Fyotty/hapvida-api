package com.fvit.hapvida.controller;

import java.util.List;

import com.fvit.hapvida.model.Consulta;
import com.fvit.hapvida.repository.ConsultaRepository;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fernando
 */
@RestController
@RequestMapping(value = "/api")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;

    @ApiOperation("Recurso para listar consultas")
    @GetMapping("/consultas")
    public List<Consulta> listar() {
        return consultaRepository.findAll();
    }

    @ApiOperation("Recurso para gravar consulta")
    @PostMapping("/consulta")
    public Consulta gravar(@RequestBody Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @ApiOperation("Recurso para excluir consulta")
    @DeleteMapping("/consulta/{id}")
    public void deletar(@PathVariable(value = "id") Long id) {
        consultaRepository.deleteById(id);
    }

}
