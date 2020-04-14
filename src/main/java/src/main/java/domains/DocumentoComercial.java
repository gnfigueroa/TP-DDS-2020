package src.main.java.domains;


public class DocumentoComercial {
	private TipoDocumento tipo;

	
	public DocumentoComercial(TipoDocumento tipo) {
		super();
		// TODO Auto-generated constructor stub
		this.tipo.generarTipo();
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}
		
}
