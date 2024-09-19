package br.com.gsoares.factory;

import br.com.gsoares.abstratos.CarroAbstrato;
import br.com.gsoares.carros.Audi;
import br.com.gsoares.carros.BMW;

public class AutomaticoFactory extends CarroFactory{
    CarroAbstrato modelo(String tipoDoCarro) {
        switch (tipoDoCarro) {
            case "A":
                return new BMW("320i", "branca");
            case "B":
                return new Audi("A4", "vermelha");
            default:
                System.out.println("Infelismente o carro não está disponível.");
                return null;
        }
    }
}
