import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Certificado;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.SalaDeChat;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana:" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana:" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());

        System.out.println("-------");

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
        devCaio.progredir();
        devCaio.progredir();
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Caio:" + devCaio.getConteudosConcluidos());
        System.out.println("XP:" + devCaio.calcularTotalXp());

        SalaDeChat salaDeChat = new SalaDeChat("Chat Java");
        salaDeChat.adicionarParticipante(devAna);
        salaDeChat.adicionarParticipante(devCaio);
        salaDeChat.adicionarModerador(mentoria);

        System.out.println("Sala de Chat: " + salaDeChat.getNome());

        System.out.println("Participantes: " + salaDeChat.getParticipantes());

        Certificado certificadoAna = new Certificado(devAna, curso1, LocalDate.now());
        Certificado certificadoCaio = new Certificado(devCaio, curso1, LocalDate.now());
        
        System.out.println("Certificado emitido para " + certificadoAna.getDesenvolvedor().getNome() + " em " + certificadoAna.getCurso().getTitulo() + " na data " + certificadoAna.getDataDeConclusao());
        System.out.println("Certificado emitido para " + certificadoCaio.getDesenvolvedor().getNome() + " em " + certificadoCaio.getCurso().getTitulo() + " na data " + certificadoCaio.getDataDeConclusao());
    }
}
