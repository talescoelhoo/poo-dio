package com.br.tales.desafio.dominio;

import java.time.LocalDateTime;
import java.util.Objects;

public class Cursos extends Conteudo{
    private int cargaHoraria;

    public Cursos(int cargaHoraria, String descricao, String titulo) {
        super(descricao, titulo);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calculoXP() {
        return 10;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "cargaHoraria = " + cargaHoraria +
                "} " + super.toString();
    }

}
