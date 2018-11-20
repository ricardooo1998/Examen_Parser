import java.util.ArrayList;

public class Acciones {
	
	private String nombre;
	private String compras;
	private String ventas;
	private String cantidadCompras;
	private String precioCompras;
	private String cantidadVentas;
	private String precioVentas;
	
	public Acciones ()
	{
		
	}
	
	public Acciones (String nombre, String compras, String ventas, String cantidadCompras, String precioCompras, String cantidadVentas, String precioVentas)
	{
		this.nombre=nombre;
		this.compras=compras;
		this.ventas=ventas;
		this.cantidadCompras=cantidadCompras;
		this.precioCompras=precioCompras;
		this.cantidadVentas=cantidadVentas;
		this.precioVentas=precioVentas;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCompras() {
		return compras;
	}

	public void setCompras(String compras) {
		this.compras = compras;
	}

	public String getVentas() {
		return ventas;
	}

	public void setVentas(String ventas) {
		this.ventas = ventas;
	}

	public String getCantidadCompras() {
		return cantidadCompras;
	}

	public void setCantidadCompras(String cantidadCompras) {
		this.cantidadCompras = cantidadCompras;
	}

	public String getPrecioCompras() {
		return precioCompras;
	}

	public void setPrecioCompras(String precioCompras) {
		this.precioCompras = precioCompras;
	}

	public String getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(String cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public String getPrecioVentas() {
		return precioVentas;
	}

	public void setPrecioVentas(String precioVentas) {
		this.precioVentas = precioVentas;
	}

	@Override
	public String toString()
	{
		return "Nombre del Banco:"+nombre+", Compras: Cantidad"+cantidadCompras+", Precio: "+precioVentas+"\n, Ventas: Cantidad"+cantidadVentas+", Precio: "+precioVentas+".\n" ;
		
	}
	
	
	

}
