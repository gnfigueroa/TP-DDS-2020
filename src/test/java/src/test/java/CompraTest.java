package src.test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.main.java.domains.Compra;
import src.main.java.domains.Item;
import src.main.java.domains.ItemArticulo;
import src.main.java.domains.ItemServicio;
import src.main.java.exceptions.ElDocumentoNoEsRemito;
import src.main.java.exceptions.LaOperacionEstaCerrada;

public class CompraTest {
	private Compra compra1;
	private Item itemArticulo1;
	private Item itemArticulo2;
	private Item itemServicio1;
	
	
	@Before
	public void init() {
		
		compra1 = new Compra(false);
		itemArticulo1 = new Item(200.20,"Cuadernos",new ItemArticulo());
		itemArticulo2 = new Item(20.20,"Lapicera",new ItemArticulo());
		itemServicio1 = new Item(2200.00,"Honorarios",new ItemServicio());
		this.compra1.agregarItem(itemArticulo1);
		this.compra1.agregarItem(itemArticulo2);

		
		
	}
	
	@Test
	public void obtenerImporteCompra() {
		Assert.assertEquals(220.40,this.compra1.calcularValor(),1.00);
			
	}

	@Test
	public void cambiaPrecioItemCompra() throws LaOperacionEstaCerrada {
		this.compra1.cambiarPrecio("Lapicera",100.00); ;
		Assert.assertEquals(300.20,this.compra1.calcularValor(),1.00);
			
	}
	
	@Test(expected = LaOperacionEstaCerrada.class)
	public void cambiaPrecioItemCompraCerrado() throws LaOperacionEstaCerrada {
		this.compra1.setCerrado(true);
		this.compra1.cambiarPrecio("Lapicera",100.00);
					
	}
	
	@Test (expected = ElDocumentoNoEsRemito.class)
	public void generarRemitoconServicio() throws ElDocumentoNoEsRemito{
		this.compra1.agregarItem(itemServicio1);
		this.compra1.generarTipoDocumentoRemito();
		//Assert.assertEquals("Remito",this.compra1.getDocumentoComercial().getTipo());
		
	}
	
	@Test 
	public void generarRemitocontodosItemsArticulos() throws ElDocumentoNoEsRemito{
		this.compra1.generarTipoDocumentoRemito();
		Assert.assertEquals("Remito",this.compra1.getDocumentoComercial().getTipo().obtenerTipo());
		
	}
	

		
		

}
