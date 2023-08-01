package Consola;
import Logica.Fecha;
import Logica.Vehiculo;
import Logica.moto;

public class Main_Vehiculo {

	public static void main(String[] args) {
		
		Fecha factual = new Fecha(31,8,2023);
		Fecha fCompra = new Fecha(4,5,2007);
		
		Vehiculo vh1 = new Vehiculo("Nissan", 250000, "AA3GH1", factual, fCompra);
		System.out.println(vh1.toString());
		
		Vehiculo vh2 = new Vehiculo("Chevrolete", 5550000, "AIO78BC", factual, fCompra);
		System.out.println(vh2.toString());
		
		//MOTO//
		
		moto mt1 = new moto(50 ,"yumbo", 540000, "RR87IO", factual, fCompra);
		System.out.println(mt1.toString());
		
		moto mt2 = new moto(100 ,"Kawasaky", 850000, "RW07IO", factual, fCompra);
		System.out.println(mt2.toString());
	}

}
