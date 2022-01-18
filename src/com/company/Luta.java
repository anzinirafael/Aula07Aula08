package com.company;

public class Luta implements ControllerLuta {
    private String desafiando;
    private String desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta(String desafiando, String desafiante, int rounds, boolean aprovada) {
        this.desafiando = desafiando;
        this.desafiante = desafiante;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    private String getDesafiando() {
        return desafiando;
    }

    private void setDesafiando(String desafiando) {
        this.desafiando = desafiando;
    }

    private String getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(String desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    @Override
    public void marcarLuta() {

    }

    @Override
    public void lutar() {

    }
}
