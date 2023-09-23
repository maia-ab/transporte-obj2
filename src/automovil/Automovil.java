package automovil;
import transporte.Transporte;

public class Automovil extends Transporte{
	public Automovil() {
		super.listaDePasajeros = new String[3];
	}
	
	
	@Override
	public void agregarPasajero(String nuevoPasajero) {
		if(super.pasajerosABordo < 3){
			super.pasajerosABordo ++;
			super.listaDePasajeros[super.pasajerosABordo - 1] = nuevoPasajero;
		}
		
	}
	
}

