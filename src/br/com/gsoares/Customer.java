package br.com.gsoares;

public class Customer {
	private String tipoDoCarro;
    private boolean isAuto;

    public Customer(String tipoDoCarro, boolean isAuto) {
        this.tipoDoCarro = tipoDoCarro;
        this.isAuto = isAuto;
    }

    public boolean isAuto() {
        return isAuto;
    }

    public String getTipoDoCarro() {
        return tipoDoCarro;
    }
}
