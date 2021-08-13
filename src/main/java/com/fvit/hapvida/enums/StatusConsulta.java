package com.fvit.hapvida.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author fernando
 */
@AllArgsConstructor
@Getter
public enum StatusConsulta {

    AGENDADA(0, "AGENDADA"), CANCELADA(1, "CANCELADA"), EMATENDIMENTO(2, "EM ATENDIMENTO"), FINALIZADA(3, "FINALIZADA");

    private int codigo;
    private String descricao;
}
