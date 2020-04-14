package src.main.java.domains;

public class ItemArticulo extends TipoItem {
	 private String articulo;
	
	 public ItemArticulo() {
		 this.articulo = "Articulo";
	 }
	
	public String getArticulo() {
		return articulo;
	}



	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	
	public String getTipo() {
		return this.articulo;
	}
	
}
