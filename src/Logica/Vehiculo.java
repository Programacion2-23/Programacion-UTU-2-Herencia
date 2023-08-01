package Logica;

public class Vehiculo {
	
	/*Dada la clase Vehiculo que permita guardar: la marca, el precio y la matricula.

 	Agregar a la clase el atributo fechaCompra de tipo Fecha (también dada)
 	Modificar todo lo necesario para que funcione correctamente.
 	Agregar el método especifico descuentoNeto(): double, tal que si el año de la fecha de compra es menor del 2010 tiene un 20% de descuento sobre el precio
 	En la clase Main, instancie y muestre los datos de 2 vehiculos.
 	Pruebe el método descuentoNeto() en la clase Main

 	Ejercicio 2 (6 puntos)

 	Crear la clase Moto que herede de Vehiculo, con el atributo cilindrada de int
 	Agregar todos los métodos básicos de la clase En la clase Main,instancie y muestre los datos de 2 motos.
 	En la clase Moto, sobreescriba el método descuentoNeto de la clase Vehiculo, teniendo en cuenta que si la cilindrada es menor a 100 tendrá un 10% de descuento adicional
 	Pruebe el método descuentoNeto() de la clase Moto en la clase Main.
 	Pruebe el método descuentoNeto() de la clase Moto en la clase Main*/
	
	private String marca;
	private double precio;
	private String matricula;
	private Fecha fecha;
	private Fecha fechaCompra;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca,double precio,String matricula,Fecha fecha, Fecha fechaCompra) {
		this.marca = marca;
		this.precio = precio;
		this.matricula = matricula;
		this.fecha = fecha;
		this.fechaCompra = fechaCompra;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Fecha getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Fecha fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	
	//Metodo Especifico.
	public double descuentoNeto() {
		double precioF = 0;
		
		if (fechaCompra.getAnio() <= 2010) {
			precioF = precio - 1.20;
		} else {
			precioF = precio;
		}
		
		return precioF;
	}
	
	@Override
	public String toString() {
		return "La marca es: " + marca + " El precio es: " + precio + " La matricula es: " + matricula + " La fecha actual es: " + fecha + " Fecha de compra fue: " 
				+ fechaCompra
				+ " El descuento neto es: " + descuentoNeto();
	}
}
