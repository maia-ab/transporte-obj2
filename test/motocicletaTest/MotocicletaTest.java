package motocicletaTest;
import org.junit.Assert;
import org.junit.Test;

import motocicleta.Motocicleta;

public class MotocicletaTest {
	@Test
	public void cuandoInicializoUnaMotoNoTieneChoferAsignado(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		valorObtenido = miMoto.hayChofer();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alAsignarUnChoferQuedaAsignado(){
		Boolean valorEsperado = Boolean.TRUE;
		Boolean valorObtenido = Boolean.FALSE;
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		miMoto.asignarChofer("Nestor");
		valorObtenido = miMoto.hayChofer();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alAsignarANestorElChoferActualEsNestor(){
		String valorEsperado = "Nestor";
		String valorObtenido = "";
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		miMoto.asignarChofer("Nestor");
		valorObtenido = miMoto.choferActual();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alCambiarElChoferCuandoNoHayChoferAsignadoNoCambiaYQuedaSinChofer(){
		Boolean valorEsperado = Boolean.FALSE;
		Boolean valorObtenido = Boolean.TRUE;
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		miMoto.cambiarChofer("Jessica");
		valorObtenido = miMoto.hayChofer();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alCambiarElChoferCuandoHayChoferAsignadoLoCambia(){
		String valorEsperado = "Jessica";
		String valorObtenido = "";
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		miMoto.asignarChofer("Nestor");
		miMoto.cambiarChofer("Jessica");
		valorObtenido = miMoto.choferActual();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	@Test
	public void alCambiarElChoferCuandoHayUnPasajeroNoLoCambia(){
		String valorEsperado = "Nestor";
		String valorObtenido = "";
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		miMoto.asignarChofer("Nestor");
		miMoto.agregarPasajero("Sofia");
		miMoto.cambiarChofer("Jessica");
		valorObtenido = miMoto.choferActual();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void alAgregarUnAcompañanteLaCantidadDePasajerosEsIgualA1(){
		int valorEsperado = 1;
		int valorObtenido = 0;
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		miMoto.agregarPasajero("Sofia");
		valorObtenido = miMoto.pasajerosABordo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}

	@Test
	public void alAgregarAFlorenciaElNombreDelPasajeroEsFlorencia(){
		String valorEsperado = "Florencia";
		String valorObtenido = "";
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		miMoto.agregarPasajero("Florencia");
		valorObtenido = miMoto.nombrePasajero(0);
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}
	
	@Test
	public void alAgregarUnAcompañanteCuandoYaHayUnoNoSeAgrega(){
		int valorEsperado = 1;
		int valorObtenido = 0;
		Motocicleta miMoto = dadoQueExisteUnaMoto();
		//
		miMoto.agregarPasajero("Florencia");
		miMoto.agregarPasajero("Sofia");
		valorObtenido = miMoto.pasajerosABordo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);		
	}	
	
	private Motocicleta dadoQueExisteUnaMoto() {
		return new Motocicleta();
	}
}





