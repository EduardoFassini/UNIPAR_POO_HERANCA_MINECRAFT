package br.unipar.minecraft;

public class Item {

    private String nome;
    private String tipo;
    private Integer dano;
    private Integer durabilidade;
    private Integer velocidade;
    private String tipoBloco;

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public void setDurabilidade(Integer durabilidade) {
        this.durabilidade = durabilidade;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoBloco(String tipoBloco) {
        this.tipoBloco = tipoBloco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getDano() {
        return dano;
    }

    public Integer getDurabilidade() {
        return durabilidade;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public String getTipoBloco() {
        return tipoBloco;
    }
}
