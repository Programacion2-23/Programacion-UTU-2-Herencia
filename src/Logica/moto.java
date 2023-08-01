package Logica;

public class moto extends Vehiculo {
	
	/*Ejercicio 2 (6 puntos)

 	Crear la clase Moto que herede de Vehiculo, con el atributo cilindrada de int
 	Agregar todos los métodos básicos de la clase En la clase Main,instancie y muestre los datos de 2 motos.
 	En la clase Moto, sobreescriba el método descuentoNeto de la clase Vehiculo, teniendo en cuenta que si la cilindrada es menor a 100 tendrá un 10% de descuento adicional
 	Pruebe el método descuentoNeto() de la clase Moto en la clase Main.
 	Pruebe el método descuentoNeto() de la clase Moto en la clase Main*/

	private int  cilindrada;
	
	public moto() {
		super();
	}
	
	public moto (int cilindrada, String marca, double precio,String matricula, Fecha fecha, Fecha fechaCompra) {
		super(marca,precio,matricula,fecha,fechaCompra);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	//METODO ESPECIFICO DE MOTO//
	public double descuentoNeto() {
		
		double descuentoDiez = 0;
		
		if (cilindrada <= 100) {
			descuentoDiez = super.descuentoNeto() - 1.10;
		} else {
			descuentoDiez = super.descuentoNeto();
		}
		
		return descuentoDiez;
	}
	
	@Override
	public String toString () {
		return super.toString() + " Cilindrada: " + cilindrada + " Descuento Neto moto: " + descuentoNeto();
	}
}
