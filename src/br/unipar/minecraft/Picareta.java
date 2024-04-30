package br.unipar.minecraft;

public class Picareta extends Ferramenta{

    Picareta() {
        tipo = "Picareta";
    }
    void quebrarPedra() {
        tipoBloco = "Pedra e seus derivados";
        System.out.println("Quebra " + tipoBloco + " com velocidade = " + velocidade);
    }

}
