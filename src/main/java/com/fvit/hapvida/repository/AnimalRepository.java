package com.fvit.hapvida.repository;

import com.fvit.hapvida.model.Animal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fernando
 */
@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
