package br.com.gsoares.factory;

import br.com.gsoares.abstratos.CarroAbstrato;
import br.com.gsoares.carros.Chevrolet;
import br.com.gsoares.carros.Fiat;

public class ManualFactory extends CarroFactory{
    CarroAbstrato modelo(String tipoDoCarro) {
        switch (tipoDoCarro) {
            case "A":
                return new Chevrolet("Celta", "preto");
            case "B":
                return new Fiat("Palio", "amarelo");
            default:
                System.out.println("Infelismente o carro não está disponível.");
                return null;
        }
    }
}
