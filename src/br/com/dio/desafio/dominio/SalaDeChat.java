package br.com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class SalaDeChat {
    private String nome;
    private List<Dev> participantes;
    private List<Mentoria> moderadores;

    public SalaDeChat(String nome) {
        this.nome = nome;
        this.participantes = new ArrayList<>();
        this.moderadores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Dev> getParticipantes() {
        return participantes;
    }

    public void adicionarParticipante(Dev dev) {
        participantes.add(dev);
    }

    public void removerParticipante(Dev dev) {
        participantes.remove(dev);
    }

    public List<Mentoria> getModeradores() {
        return moderadores;
    }

    public void adicionarModerador(Mentoria mentoria) {
        moderadores.add(mentoria);
    }

    public void removerModerador(Mentoria mentoria) {
        moderadores.remove(mentoria);
    }
}
