package br.unipar.minecraft;

public class Ferramenta {

    String nome;
    String tipo;
    int dano;
    int durabilidade;
    int velocidade;
    String material;
    String tipoBloco = "Blocos em geral";

    void bater() {
        System.out.println("Dar dano = " + dano);
    }
    void quebrarBloco() {
        System.out.println("Quebra " + tipoBloco + " com velocidade = " + velocidade);
    }
}
