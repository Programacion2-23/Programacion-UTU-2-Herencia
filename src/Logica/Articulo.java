package Logica;

public class Articulo {
	
	private int codigo;
	private String nombre;
	private double precioCuesta;
	private Fecha fecha;
	//NUEVO
	private Fecha vencimiento;

	
	public Articulo() {
		
	}
	
	public Articulo(int codigo,String nombre, double precioCuesta,Fecha fecha,Fecha vencimiento) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioCuesta = precioCuesta;
		this.fecha = fecha;
		this.vencimiento = vencimiento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioCosta() {
		return precioCuesta;
	}

	public void setPrecioCosta(double precioCosta) {
		this.precioCuesta = precioCosta;
	}

	public Fecha getFechaVenc() {
		return fecha;
	}

	public void setFechaVenc(Fecha fechaVenc) {
		this.fecha = fecha;
	}
	
	public double getPrecioCuesta() {
		return precioCuesta;
	}

	public void setPrecioCuesta(double precioCuesta) {
		this.precioCuesta = precioCuesta;
	}

	public Fecha getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Fecha vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public double precioVenta() {
		return precioCuesta * 1.20;
	}
	
	//NUEVO
	public boolean estaVencido(Fecha fechaAct){
		
		int comparacion = fechaAct.getAnio(); 
		int vencimiento = getVencimiento().getAnio();
		
		
		if (comparacion != vencimiento) {
			return true;
		} else {
			return false;
		}
		
	}
	
	@Override
	public String toString() {
		return ("Codigo: " + codigo + " Nombre: " + nombre + " precio: " + precioVenta() + 
				fecha + " " + estaVencido(fecha)) + "";
	}

}
