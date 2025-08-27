package br.com.exercicio.screenmatch.modelos;

import br.com.exercicio.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    //CONSTRUTORES


    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    //METODOS

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
