package br.unipar.minecraft;

public class Personagem extends Ferramenta{

    int vida;
    int fome;
    String nickName;

    void usarFerramenta(){
        bater();
        quebrarBloco();
    }
    void andar(){
        System.out.println("O personagem anda");
    }
    void correr(){
        System.out.println("O personagem corre");
    }
    void agachar(){
        System.out.println("O personagem agacha");
    }
    void pular(){
        System.out.println("O personagem pula");
    }
}
