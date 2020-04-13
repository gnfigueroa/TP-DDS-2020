package src.test.java;

import org.junit.Assert;
import org.junit.Test;

import src.main.java.domains.Item;

public class PruebaTest {
	
	@Test
	public void prueba() {
		Item item1;
		item1 = new Item(420.00,"Mermelada");
		Assert.assertEquals("Mermelada",item1.getConcepto());		
		
	}

}
