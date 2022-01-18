package com.company;

public class Main {

    public static void main(String[] args) {
        //Definição de lutadores participantes
        Lutador lutador1 = new Lutador("Pretty Boy", "França",
                31, 1.75f, 68.9f,11, 2, 1);
        Lutador lutador2 = new Lutador("Putscript", "Brasileiro",
                29, 1.68f,57.8f, 14, 2, 3);
        Lutador lutador3 = new Lutador("SnapShadow", "EUA", 35, 1.65f, 80.9f,
                12, 2, 1);
        Lutador lutador4 = new Lutador("Dead Code", "Austrália", 28, 1.93f,
                81.6f,13, 0, 2);
        Lutador lutador5 = new Lutador("Ufcobol", "Brasil", 37, 1.70f, 119.3f
                , 5, 4, 3);
        Lutador lutador6 = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f,
                12, 2, 4);
        Luta luta1 = new Luta(lutador1, lutador2, 3, false);
        luta1.marcarLuta(lutador1, lutador2);
        luta1.lutar();
    }
}
