package autobusTest;

import org.junit.Assert;
import org.junit.Test;
import autobus.Autobus;

public class AutobusTest {
	@Test
	public void alCambiarElChoferCuandoHayUnPasajeroNoLoCambia(){
		String valorEsperado = "Nestor";
		String valorObtenido = "";
		Autobus miAutobus= dadoQueExisteUnAutobus();
		//
		miAutobus.asignarChofer("Nestor");
		miAutobus.agregarPasajero("Sofia");
		miAutobus.cambiarChofer("Jessica");
		valorObtenido = miAutobus.choferActual();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alAgregarUnPasajeroLaCantidadDePasajerosABordoEs1(){
		int valorEsperado = 1;
		int valorObtenido = 0;
		Autobus miAutobus = dadoQueExisteUnAutobus();
		//
		miAutobus.agregarPasajero("Sofia");
		valorObtenido = miAutobus.pasajerosABordo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alAgregarUnPasajeroCuandoYaHay20PasajerosNoAgrega(){
		int valorEsperado = 20;
		int valorObtenido = 0;
		Autobus miAutobus = dadoQueExisteUnAutobus();
		//
		for (int i = 0; i < 20; i++) {
			miAutobus.agregarPasajero("Sofia");
		}
		miAutobus.agregarPasajero("Sofia");
		
		valorObtenido = miAutobus.pasajerosABordo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alAgregarALuciaComoQuintaPasajeraElNombreDeElPasajeroNumero5EsLucia(){
		String valorEsperado = "Lucia";
		String valorObtenido = "";
		Autobus miAutobus = dadoQueExisteUnAutobus();
		//
		for (int i = 0; i < 4; i++) {
			miAutobus.agregarPasajero("Sofia");
		}
		miAutobus.agregarPasajero("Lucia");
		miAutobus.agregarPasajero("Eduardo");
		
		valorObtenido = miAutobus.nombrePasajero(4);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	private Autobus dadoQueExisteUnAutobus() {
		return new Autobus();
	}
}
