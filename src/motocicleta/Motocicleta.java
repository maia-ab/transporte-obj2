package motocicleta;

import transporte.Transporte;

public class Motocicleta extends Transporte{
	
	public Motocicleta() {
		super.listaDePasajeros = new String[1];
	}
	
	@Override
	public void agregarPasajero(String nuevoPasajero){
		if (super.pasajerosABordo == 0){
			super.pasajerosABordo ++;
			super.listaDePasajeros[0] = nuevoPasajero;
		}
		
	}
	

}


