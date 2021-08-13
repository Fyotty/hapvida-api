package com.fvit.hapvida.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author fernando
 */
@AllArgsConstructor
@Getter
public enum TipoAnimal {

    CACHORRO(0, "CACHORRO"), GATO(1, "GATO"), RAMISTER(2, "RAMISTER"), PEIXE(3, "PEIXE");

    private int codigo;
    private String descricao;

}
