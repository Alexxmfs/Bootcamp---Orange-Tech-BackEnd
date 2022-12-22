import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Curso curso1 = new Curso();
      curso1.setTitulo("curso java");
      curso1.setDescricao("descrição curso java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("curso js");
      curso2.setDescricao("descrição curso js");
      curso2.setCargaHoraria(4);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.setDescricao("descrição mentoria java");
      mentoria.setData(LocalDate.now());

       // System.out.println(curso1);
       // System.out.println(curso2);
       // System.out.println(mentoria);

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescricao("Descrição Bootcamp Java Developer");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(mentoria);

      Dev devAlex = new Dev();
      devAlex.setNome("Alex");
      devAlex.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Alex:" + devAlex.getConteudosInscritos());
      devAlex.progredir();
      devAlex.progredir();
      devAlex.progredir();
      System.out.println("Conteudos Inscritos Alex:" + devAlex.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Alex:" + devAlex.getConteudosConcluidos());
      System.out.println("XP" + devAlex.calcularTotalXp());

      System.out.println("-------");

      Dev devChico = new Dev();
      devChico.setNome("Chico");
      devChico.inscreverBootcamp(bootcamp);
      System.out.println("Conteudos Inscritos Chico:" + devChico.getConteudosInscritos());
      devChico.progredir();
      System.out.println("-------");

      System.out.println("Conteudos Inscritos Chico:" + devChico.getConteudosInscritos());
      System.out.println("Conteudos Concluidos Chico:" + devChico.getConteudosConcluidos());
      System.out.println("XP" + devChico.calcularTotalXp());

    }
}