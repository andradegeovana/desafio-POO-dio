import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("Descricao curso javascript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev geovana = new Dev();
        geovana.setNome("Geovana");
        geovana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Geovana " + geovana.getConteudosInscritos());

        geovana.progredir();
        geovana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Geovana " + geovana.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Geovana " + geovana.getConteudosConcluidos());
        System.out.println("XP: " + geovana.calcularTotalXp());

        System.out.println("----------------");

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João " + joao.getConteudosInscritos());

        joao.progredir();
        joao.progredir();
        joao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João " + joao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João " + joao.getConteudosConcluidos());
        System.out.println("XP: " + joao.calcularTotalXp());
    }
}
