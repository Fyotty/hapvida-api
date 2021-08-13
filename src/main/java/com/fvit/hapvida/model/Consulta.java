package com.fvit.hapvida.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fvit.hapvida.enums.StatusConsulta;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author fernando
 */
@Entity
@Data
@Table(name = "consulta")
public class Consulta {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Basic(optional = false)
    @Column(name = "data_consulta")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-3")
    private Date dataConsulta;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private StatusConsulta status;

    @JoinColumn(name = "id_animal", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Animal idAnimal;

    @JoinColumn(name = "id_veterinario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Veterinario idVeterinario;

}
