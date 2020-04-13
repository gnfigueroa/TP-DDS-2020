package src.main.java.domains;

import src.main.java.exceptions.ElDocumentoNoEsRemito;
import src.main.java.exceptions.LaOperacionEgresoEstaCerrada;

public class DocumentoComercial {
	private int numero;
	private TipoDocumento tipo;

	
	public DocumentoComercial(TipoDocumento tipo,int numero) {
		super();
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.tipo.generarTipo(this);;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}
	
	public void generarTipoDocumentoRemito(Egreso egreso) throws ElDocumentoNoEsRemito {
		 if (!egreso.items.stream().allMatch(it -> it.getTipoItem().getTipo().equals("Articulo"))){
			 //error
			 throw new ElDocumentoNoEsRemito();
		 };
		this.tipo.generarTipo(this);;
		 
	}
}
