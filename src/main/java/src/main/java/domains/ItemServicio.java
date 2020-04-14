package src.main.java.domains;

public class ItemServicio extends TipoItem  {
	private String servicio;

	public ItemServicio() {
		 this.servicio = "Servicio";
	 }
	
	
	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public String getTipo() {
		return this.servicio;
	}
	

}
