package com.br.tales.desafio.dominio;

public abstract class Conteudo {

    protected static final Double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public abstract double calculoXP();

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "titulo = '" + titulo + '\'' +
                ", descricao = '" + descricao + '\'' +
                '}';
    }
}
