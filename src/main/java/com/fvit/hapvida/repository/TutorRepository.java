package com.fvit.hapvida.repository;

import com.fvit.hapvida.model.Tutor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fernando
 */
@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {

}
