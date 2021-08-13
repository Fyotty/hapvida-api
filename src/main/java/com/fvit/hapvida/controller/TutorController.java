package com.fvit.hapvida.controller;

import java.util.List;

import com.fvit.hapvida.model.Tutor;
import com.fvit.hapvida.repository.TutorRepository;
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
public class TutorController {

    @Autowired
    private TutorRepository tutorRepository;

    @ApiOperation("Recurso para listar tutores")
    @GetMapping("/tutores")
    public List<Tutor> listar() {
        return tutorRepository.findAll();
    }

    @ApiOperation("Recurso para gravar tutor")
    @PostMapping("/tutor")
    public Tutor gravar(@RequestBody Tutor tutor) {
        return tutorRepository.save(tutor);
    }

    @ApiOperation("Recurso para excluir tutor")
    @DeleteMapping("/tutor/{id}")
    public void deletar(@PathVariable(value = "id") Long id) {
        tutorRepository.deleteById(id);
    }

}
