package br.unipar.minecraft;

public class Espada extends Item{

    private Integer velocidadeDeAtaque;

    public Integer getVelocidadeDeAtaque() {
        return velocidadeDeAtaque;
    }
    public void setVelocidadeDeAtaque(Integer velocidadeDeAtaque) {
        this.velocidadeDeAtaque = velocidadeDeAtaque;
    }

    private Espada(){
        setTipo("Espada");
        setTipoBloco("Teia de aranha");
    }
}
