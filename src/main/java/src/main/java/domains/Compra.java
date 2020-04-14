package src.main.java.domains;

import java.util.ArrayList;
import java.util.List;

import src.main.java.exceptions.ElDocumentoNoEsRemito;
import src.main.java.exceptions.LaOperacionEgresoEstaCerrada;

public class Compra implements Operacion {
	private boolean cerrado;
	private DocumentoComercial documentoComercial;
	List<Item> items = new ArrayList<>();
	
	
	public Compra(boolean cerrado) {
		super();
		this.cerrado = cerrado;
	}

	
	public boolean isCerrado() {
		return cerrado;
	}

	public void setCerrado(boolean cerrado) {
		this.cerrado = cerrado;
	}

	public DocumentoComercial getDocumentoComercial() {
		return documentoComercial;
	}

	public void setDocumentoComercial(DocumentoComercial documentoComercial) {
		this.documentoComercial = documentoComercial;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
		
	}
	
	public Item buscarItem(String conceptoArticulo) {
		return this.items.stream()
				.filter(it -> it.getConcepto() == conceptoArticulo)
				.findFirst().get();
			    
	}

	public void BorrarItem(Item item) {
		this.items.remove(item);
	}

	public double calcularValor() {
		return items.stream().mapToDouble(it -> it.getImporte()).sum();
	}
	
	public void cambiarPrecio(String conceptoArticulo,double importe) throws LaOperacionEgresoEstaCerrada {
		if (this.isCerrado()) {
			throw new LaOperacionEgresoEstaCerrada();
		}
		//cambiar precio
		this.items.stream()
		.filter(it -> it.getConcepto() == conceptoArticulo)
		.forEach(it -> it.setImporte(importe));		

		
	}
	
	public void generarTipoDocumentoRemito(Compra compra) throws ElDocumentoNoEsRemito {
		 if (!compra.items.stream().allMatch(it -> it.getTipoItem().getTipo().equals("Articulo"))){
			 //error
			 throw new ElDocumentoNoEsRemito();
		 };
		this.documentoComercial = new DocumentoComercial(new Remito());
	 }
	@Override
	public void realizarOperacion(double gasto) {
		// TODO Auto-generated method stub
		
	}
}
