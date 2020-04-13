package src.main.java.domains;

public class Remito extends TipoDocumento{
	
	 public void generarTipo(DocumentoComercial doc){
		 doc.setTipo(new Remito());
		 
	 };
	 
}
