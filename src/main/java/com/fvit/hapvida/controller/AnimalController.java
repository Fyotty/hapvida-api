package com.fvit.hapvida.controller;

import java.util.List;

import com.fvit.hapvida.model.Animal;
import com.fvit.hapvida.repository.AnimalRepository;
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
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @ApiOperation("Recurso para listagem de animais")
    @GetMapping("/animais")
    public List<Animal> listar() {
        return animalRepository.findAll();
    }

    @ApiOperation("Recurso para gravar animal")
    @PostMapping("/animal")
    public Animal gravar(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }
    
    @ApiOperation("Recurso para excluir animal")
    @DeleteMapping("/animal/{id}")
    public void deletar(@PathVariable(value = "id") Long id) {
        animalRepository.deleteById(id);
    }

}
