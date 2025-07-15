package com.br.tales.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String tittulo;
    private String descricao;
    private LocalDate data;

    public Mentoria(String tittulo, String descricao, LocalDate data ){
        this.tittulo = tittulo;
        this.descricao = descricao;
        this.data = data;
    }

    public String getTittulo() {
        return tittulo;
    }

    public void setTittulo(String tittulo) {
        this.tittulo = tittulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "tittulo='" + tittulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
