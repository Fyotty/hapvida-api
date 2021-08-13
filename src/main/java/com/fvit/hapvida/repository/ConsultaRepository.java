package com.fvit.hapvida.repository;

import com.fvit.hapvida.model.Consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fernando
 */
@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
