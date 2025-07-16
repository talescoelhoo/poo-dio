package com.br.tales.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudoConcluido;
    }

    public void proguedir(){
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluido.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        }else{
            System.err.println("Você não esta matriculado em nemhum curso");
        }
    }

    public void inscrever(Bootcamp bootcamp){
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscrito().add(this);
    }
    public double calculoTotalXP(){
        return this.conteudoConcluido.stream().mapToDouble(conteudo -> {
            return conteudo.calculoXP();
        }).sum();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && conteudoInscrito.equals(dev.conteudoInscrito) && conteudoConcluido.equals(dev.conteudoConcluido);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nome);
        result = 31 * result + conteudoInscrito.hashCode();
        result = 31 * result + conteudoConcluido.hashCode();
        return result;
    }
}
