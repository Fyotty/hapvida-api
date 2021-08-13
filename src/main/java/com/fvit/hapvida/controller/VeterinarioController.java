package com.fvit.hapvida.controller;

import java.util.List;

import com.fvit.hapvida.model.Veterinario;
import com.fvit.hapvida.repository.VeterinarioRepository;
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
public class VeterinarioController {

    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @ApiOperation("Recurso para listar veterinários")
    @GetMapping("/veterinarios")
    public List<Veterinario> listar() {
        return veterinarioRepository.findAll();
    }

    @ApiOperation("Recurso para gravar veterinário")
    @PostMapping("/veterinario")
    public Veterinario gravar(@RequestBody Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }

    @ApiOperation("Recurso para excluir veterinário")
    @DeleteMapping("/veterinario/{id}")
    public void deletar(@PathVariable(value = "id") Long id) {
        veterinarioRepository.deleteById(id);
    }

}
