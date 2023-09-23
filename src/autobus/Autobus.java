package autobus;

import transporte.Transporte;

public class Autobus extends Transporte{
	public Autobus() {
		super.listaDePasajeros = new String[20];
	}
	
	
	@Override
	public void agregarPasajero(String nuevoPasajero) {
		if(super.pasajerosABordo < 20){
			super.pasajerosABordo ++;
			super.listaDePasajeros[super.pasajerosABordo - 1] = nuevoPasajero;
		}
		
	}
	
}
