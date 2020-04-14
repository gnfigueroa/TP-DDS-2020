package src.test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.main.java.domains.Item;
import src.main.java.domains.ItemArticulo;
import src.main.java.domains.ItemServicio;

public class ItemTest {
	private Item item1;
	private Item item2;

	
	@Before
	public void Init() {
		item1 = new Item(50.20,"Honorarios",new ItemServicio());
		item2 = new Item(20.20,"Cuadernos",new ItemArticulo());
		
	}
	@Test
	public void obtenerConceptoItem() {
		Assert.assertEquals("Honorarios",this.item1.getConcepto());		
	}
	
	@Test
	public void obtenerImporteItem() {
		Assert.assertEquals(50.20,this.item1.getImporte(),1.00);		
	}
	
	@Test
	public void obtenerTipoItemServ() {
		Assert.assertEquals("Servicio",this.item1.getTipoItem().getTipo());		
	}
	
	@Test
	public void obtenerTipoItemA() {
		Assert.assertEquals("Articulo",this.item2.getTipoItem().getTipo());		
	}
	
	@Test
	public void cambiarTipoItemArticuloaServicio() {
		ItemServicio tipoServicio = new ItemServicio();
		item2.cambiarTipoA(tipoServicio);
		Assert.assertEquals("Servicio",this.item2.getTipoItem().getTipo());		
	}
	
	

}
