package src.test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.main.java.domains.Egreso;
import src.main.java.domains.Item;
import src.main.java.domains.ItemArticulo;
import src.main.java.exceptions.LaOperacionEstaCerrada;

public class EgresoTest {
	private Egreso egreso1;
	private Item itemArticulo1;
	private Item itemArticulo2;

	
	
	@Before
	public void init() {
		
		egreso1 = new Egreso(false);
		itemArticulo1 = new Item(200.20,"Cuadernos",new ItemArticulo());
		itemArticulo2 = new Item(20.20,"Lapicera",new ItemArticulo());
		this.egreso1.agregarItem(itemArticulo1);
		this.egreso1.agregarItem(itemArticulo2);
		
		
	}
	
	@Test
	public void obtenerImporteEgreso() {
		Assert.assertEquals(220.40,this.egreso1.calcularValor(),1.00);
			
	}

	@Test
	public void cambiaPrecioItem() throws LaOperacionEstaCerrada {
		this.egreso1.cambiarPrecio("Lapicera",100.00); ;
		Assert.assertEquals(300.20,this.egreso1.calcularValor(),1.00);
			
	}
	
	@Test(expected = LaOperacionEstaCerrada.class)
	public void cambiaPrecioItemEgresoCerrado() throws LaOperacionEstaCerrada {
		this.egreso1.setCerrado(true);
		this.egreso1.cambiarPrecio("Lapicera",100.00);
					
	}
	

		
		

}
