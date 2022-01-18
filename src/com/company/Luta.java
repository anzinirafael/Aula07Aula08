package com.company;

import java.util.Random;

public class Luta {
    private Lutador desafiando;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;

    public Luta(Lutador desafiando, Lutador desafiado, int rounds, boolean aprovada) {
        this.desafiando = desafiando;
        this.desafiado = desafiado;
        this.rounds = rounds;
        this.aprovada = aprovada;
    }

    private Lutador getDesafiando() {
        return desafiando;
    }

    private void setDesafiando(Lutador desafiando) {
        this.desafiando = desafiando;
    }

    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
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


    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1.getNome() != l2.getNome()){
            this.setAprovada(true);
            this.setDesafiando(l1);
            this.setDesafiado(l2);
        }
        else{
            this.setAprovada(false);
            this.setDesafiando(null);
            this.setDesafiado(null);
            System.out.println("Não foi possivel marcar a luta.");
        }
    }

    public void lutar() {
        if(this.isAprovada() == true){
            System.out.println("##### Desafiante #####");
            this.desafiando.apresentar();
            System.out.println("##### Desafiado #####");
            this.desafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiando.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1:
                    System.out.println("Ganhou o desafiado " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiando.perderLuta();
                    break;
                case 2:
                    System.out.println("Ganhou o desafiante" + this.desafiando.getNome());
                    this.desafiando.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }
        else{
            System.out.println("A luta não pode acontecer pois não foi realizada a aprovação");
        }
    }
}
