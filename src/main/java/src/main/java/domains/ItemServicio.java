package src.main.java.domains;

public class ItemServicio extends TipoItem  {
	private String servicio;

	public ItemServicio(String servicio) {
		 this.servicio = servicio;
	 }
	
	@Override
	 public void generarTipo(Item item){
	      item.cambiarTipoA(new ItemServicio("Servicio"));
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
