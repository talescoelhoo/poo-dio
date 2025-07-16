package com.br.tales.desafio.dominio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataConclusao = LocalDate.now().plusDays(45);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Set<Dev> devInscrito = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Set<Dev> getDevInscrito() {
        return devInscrito;
    }

    public void setDevInscrito(Set<Dev> devInscrito) {
        this.devInscrito = devInscrito;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(descricao, bootcamp.descricao) && dataInicio.equals(bootcamp.dataInicio) && dataConclusao.equals(bootcamp.dataConclusao) && Objects.equals(conteudos, bootcamp.conteudos) && Objects.equals(devInscrito, bootcamp.devInscrito);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(descricao);
        result = 31 * result + dataInicio.hashCode();
        result = 31 * result + dataConclusao.hashCode();
        result = 31 * result + Objects.hashCode(conteudos);
        result = 31 * result + Objects.hashCode(devInscrito);
        return result;
    }
}
