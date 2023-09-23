package automovilTest;
import org.junit.Assert;
import org.junit.Test;

import automovil.Automovil;

public class AutomovilTest {
	@Test
	public void alAgregarUnPasajeroLaCantidadDePasajerosABordoEs1(){
		int valorEsperado = 1;
		int valorObtenido = 0;
		Automovil miAutoMovil = dadoQueExisteUnAutomovil();
		//
		miAutoMovil.agregarPasajero("Sofia");
		valorObtenido = miAutoMovil.pasajerosABordo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alAgregarUnPasajeroCuandoYaHay3PasajerosNoAgrega(){
		int valorEsperado = 3;
		int valorObtenido = 0;
		Automovil miAutoMovil = dadoQueExisteUnAutomovil();
		//
		for (int i = 0; i < 3; i++) {
			miAutoMovil.agregarPasajero("Sofia");
		}
		miAutoMovil.agregarPasajero("Lucia");
		
		valorObtenido = miAutoMovil.pasajerosABordo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	private Automovil dadoQueExisteUnAutomovil() {
		return new Automovil();
	}
}
