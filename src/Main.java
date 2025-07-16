import com.br.tales.desafio.dominio.Bootcamp;
import com.br.tales.desafio.dominio.Cursos;
import com.br.tales.desafio.dominio.Dev;
import com.br.tales.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cursos cursos1 = new Cursos(45, "Cursos de Java Poo", "Cursos java");
        Mentoria mentoria = new Mentoria("Mentoria java", "Mentoria do curso de Poo", LocalDate.now());

        Cursos cursos2 = new Cursos(40, "Cursos de javaScript ", "Cursos javaScript");
        Mentoria mentoria2 = new Mentoria("Mentoria javaScript", "Mentoria do curso de javaScript", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Curso java");
        bootcamp.setDescricao("curso de POO em java");
        bootcamp.getConteudos().add(cursos1);
        bootcamp.getConteudos().add(cursos2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria2);

        Dev devJulia= new Dev();
        devJulia.setNome("devJulia");
        devJulia.inscrever(bootcamp);
        System.out.println("Conteúdo inscrito de Julia: " + devJulia.getConteudoInscrito());
        System.out.println("---");
        devJulia.proguedir();
        devJulia.proguedir();
        System.out.println(devJulia.calculoTotalXP());
        System.out.println("Conteúdo concluído de Julia: " + devJulia.getConteudoConcluido());
        System.out.println("-----------");

        Dev devPedro= new Dev();
        devPedro.setNome("devPedro");
        devPedro.inscrever(bootcamp);
        System.out.println("Conteúdo inscrito de Pedro: " + devPedro.getConteudoInscrito());
        devPedro.proguedir();
        System.out.println(devPedro.calculoTotalXP());
        System.out.println("Conteúdo concluído de Pedro: " + devPedro.getConteudoConcluido());
        System.out.print("-----------");
    }
}