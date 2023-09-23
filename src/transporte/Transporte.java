package transporte;

public abstract class Transporte {
	protected Integer kmRecorridos;
	protected String chofer = "";
	protected Integer pasajerosABordo = 0;
	protected String[] listaDePasajeros;
	
	public Boolean hayChofer(){
		return chofer != "";
	}
	
	public String choferActual() {
		return this.chofer;
	}
	
	public Integer pasajerosABordo(){
		return pasajerosABordo;
		
	}
	
	public String nombrePasajero(Integer numPasajero){
		return listaDePasajeros[numPasajero];
	}
	
	public void asignarChofer(String choferAsignado){
		if(!(this.hayChofer())) {
			this.chofer = choferAsignado;
		}
	}
	public void cambiarChofer(String choferNuevo){
		if(this.hayChofer() && this.pasajerosABordo == 0){
			this.chofer = choferNuevo;
		}		
	}

	abstract public void agregarPasajero(String nuevoPasajero);

}
