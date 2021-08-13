package com.fvit.hapvida.repository;

import com.fvit.hapvida.model.Veterinario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fernando
 */
@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Long> {

}
