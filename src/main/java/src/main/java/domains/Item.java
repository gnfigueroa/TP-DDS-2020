package src.main.java.domains;

public class Item {
	private double importe;
	private String concepto;
	private TipoItem tipoItem;

	public Item(double importe,String concepto,TipoItem tipoitem) {
		super();
		// TODO Auto-generated constructor stub
		this.setImporte(importe);
		this.setConcepto(concepto);		
		this.cambiarTipoA(tipoitem);
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public TipoItem getTipoItem() {
		return tipoItem;
	}

	public void cambiarTipoA(TipoItem tipoItem) {
		this.tipoItem = tipoItem;
	}
	
	
	
	
	
	

}
