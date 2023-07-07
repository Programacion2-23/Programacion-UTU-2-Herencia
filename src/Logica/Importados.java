package Logica;

public class Importados extends Articulo {

	private double impuesto;
	private int anioImportacion;
	
	public Importados () {
		super();
	}
	
	public Importados(int codigo, String nombre, double precioCuesta,Fecha fecha, 
			Fecha vencimiento, double impuesto, int anioimportacion) {
		super(codigo,nombre,precioCuesta,fecha,vencimiento);
		
		this.impuesto = impuesto;
		this.anioImportacion = anioimportacion;
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public int getAnioImportacion() {
		return anioImportacion;
	}

	public void setAnioImportacion(int anioImportacion) {
		this.anioImportacion = anioImportacion;
	}
	
	public double precioVenta() {
		
		if (anioImportacion <= 2008) {
			return super.precioVenta() * impuesto * 1.80;
		} else {
			return super.precioVenta() * impuesto * 1.100;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + " Impuesto: " + impuesto + " Anio Importacion: " + anioImportacion 
				+ " Precio con impuesto: " + precioVenta();
	}
}
