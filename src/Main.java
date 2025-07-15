import com.br.tales.desafio.dominio.Cursos;
import com.br.tales.desafio.dominio.Mentoria;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        Cursos cursos = new Cursos(30, "Java para iniciante", "Java");
        Mentoria mentoria = new Mentoria("curso java", "crusos de poo em java", ld);
        System.out.printf("- %s \n", cursos);
        System.out.printf("- %s \n", mentoria);
    }
}