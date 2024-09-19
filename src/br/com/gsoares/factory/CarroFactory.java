package br.com.gsoares.factory;

import br.com.gsoares.abstratos.CarroAbstrato;

public abstract class CarroFactory {

    public CarroAbstrato create(String tipoDoCarro) {
    	CarroAbstrato car = modelo(tipoDoCarro);
        return car;
    }
    abstract CarroAbstrato modelo(String tipoDoCarro);
}
