package Logica;

public class Nacional extends Articulo{

	private String departamento;
	private boolean subsidiado;
	
	public Nacional () {
		super();
	}
	
	public Nacional(int codigo, String nombre, double precioCuesta,Fecha fecha, 
			Fecha vencimiento, String departamento, boolean subsidiado) {
		
		super(codigo,nombre,precioCuesta,fecha,vencimiento);
		this.departamento = departamento;
		this.subsidiado = subsidiado;
		
	}

	public boolean getSubsidiado() {
		return subsidiado;
	}

	public void setSubsidiado(boolean subsidiado) {
		this.subsidiado = subsidiado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public double precioVenta() {
		
		if (departamento == "Montevideo" || departamento == "montevideo") {
			return super.precioVenta() * 1.15;
		} else if (departamento == "Interior" || departamento == "interior") {
			return super.precioVenta() * 1.10;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return super.toString() + " Subsidiados " + super.precioVenta() + " No subsidiados " + precioVenta();
	}
	
}
