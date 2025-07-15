package com.br.tales.desafio.dominio;

import java.time.LocalDateTime;
import java.util.Objects;

public class Cursos {
    private String titilo;
    private String descricao;
    private int cargaHoraria;

    public Cursos(int cargaHoraria, String descricao, String titilo) {
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
        this.titilo = titilo;
    }

    public String getTitilo() {
        return titilo;
    }

    public void setTitilo(String titilo) {
        this.titilo = titilo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
                "titilo='" + titilo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cursos cursos = (Cursos) o;
        return Objects.equals(titilo, cursos.titilo) && Objects.equals(cargaHoraria, cursos.cargaHoraria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titilo, cargaHoraria);
    }
}
