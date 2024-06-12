import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devHeloisa = new Dev();
        devHeloisa.setNome("Heloisa");
        devHeloisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Heloisa " + devHeloisa.getConteudosInscritos());
        devHeloisa.progredir();
        devHeloisa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Heloisa " + devHeloisa.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Heloisa " + devHeloisa.getConteudosConcluidos());
        System.out.println("XP: " + devHeloisa.calcularTotalXp());

        System.out.println("===============");

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Marcos " + devMarcos.getConteudosInscritos());
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Marcos " + devMarcos.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Marcos " + devMarcos.getConteudosConcluidos());
        System.out.println("XP: " + devMarcos.calcularTotalXp());
    }
}
