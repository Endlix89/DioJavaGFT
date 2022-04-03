import dominio.Bootcamp;
import dominio.Conteudo;
import dominio.Curso;
import dominio.Mentoria;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso JAVA");
        curso1.setCargahora(8);

        Curso curso2 = new curso();
        curso1.setTitulo("curso Javascript");
        curso1.setDescricao("descrição curso Javascript");
        curso1.setCargahora(6);

        Conteudo conteudo = new Curso();


        Mentoria mentoria = new mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição da mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new bootcamp();
        bootcamp.setNome("Bootcamp Java Developed");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElder = new Dev();
        devElder.setNome("Elder");
        devElder.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Elder: " +devElder.ConteudoInscritos());
        devElder.progredir();
        System.out.println("-");
        System.out.println("XP: " + devElder.calcularTotalXP());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João: " +devJoao.ConteudoInscritos());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("XP: " + devJoao.calcularTotalXP());

    }

}