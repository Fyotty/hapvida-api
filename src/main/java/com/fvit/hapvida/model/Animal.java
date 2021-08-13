package com.fvit.hapvida.model;

import java.util.Date;

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
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fvit.hapvida.enums.TipoAnimal;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author fernando
 */
@Entity
@Data
@Table(name = "animal")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public class Animal implements java.io.Serializable {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "especie")
    @Enumerated(EnumType.ORDINAL)
    private TipoAnimal especie;

    @Column(name = "raca")
    private String raca;

    @Column(name = "data_nascimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-3")
    private Date dataNascimento;

    @JoinColumn(name = "id_tutor", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Tutor idTutor;

}
