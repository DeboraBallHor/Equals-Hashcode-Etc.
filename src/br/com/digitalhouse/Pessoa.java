package br.com.digitalhouse;

public class Pessoa {

    private String nome;
    private Integer rg;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer rg) {

    this.nome =nome;
    this.rg =rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    @Override
    public Integer hashCode() {
        return nome + rg.hashCode();
    }

    @Override
    public String toString() {
        return "RG: " + getRg() + "\nNome" + getNome();
    }
}
}
