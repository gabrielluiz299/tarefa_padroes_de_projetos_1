package br.com.gsoares;

import br.com.gsoares.factory.AutomaticoFactory;
import br.com.gsoares.factory.CarroFactory;
import br.com.gsoares.factory.ManualFactory;
import br.com.gsoares.abstratos.CarroAbstrato;

public class Main {

	public static void main(String[] args) {
		   Customer customer1 = new Customer("B", true);
	        CarroFactory factory = getCarFactory(customer1);
	        CarroAbstrato car1 = factory.create(customer1.getTipoDoCarro());
	        car1.ligaMotor();
	    }

	    private static CarroFactory getCarFactory(Customer customer1) {
	        if(customer1.isAuto()) {
	            return new AutomaticoFactory();
	        } else {
	            return new ManualFactory();
	        }
	    }
}
