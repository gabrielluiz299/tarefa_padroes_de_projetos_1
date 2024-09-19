package br.com.gsoares.abstratos;

public abstract class CarroAbstrato {

    private String nome;
    private String cor;


    public CarroAbstrato(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public void ligaMotor(){
        System.out.println("O " + nome + " da cor " + cor + " já está ligado e proto para utilização!!!");
    }
}
