package src.main.java.domains;

public class Remito extends TipoDocumento{
	String remito;
	

	public Remito() {
		this.remito = "Remito";
	}

	public String obtenerTipo() {
		return this.remito;
	}

	public void setTipo(String remito) {
		this.remito = remito;
	}

	
}
