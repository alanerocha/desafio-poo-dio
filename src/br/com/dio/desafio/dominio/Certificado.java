package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {
    private Dev desenvolvedor;
    private Curso curso;
    private LocalDate dataDeConclusao;

    public Certificado(Dev desenvolvedor, Curso curso, LocalDate dataDeConclusao) {
        this.desenvolvedor = desenvolvedor;
        this.curso = curso;
        this.dataDeConclusao = dataDeConclusao;
    }

    public Dev getDesenvolvedor() {
        return desenvolvedor;
    }

    public void setDesenvolvedor(Dev desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataDeConclusao() {
        return dataDeConclusao;
    }

    public void setDataDeConclusao(LocalDate dataDeConclusao) {
        this.dataDeConclusao = dataDeConclusao;
    }
}
