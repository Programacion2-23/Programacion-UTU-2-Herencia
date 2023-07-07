package Consola;

import Logica.Articulo;
import Logica.Fecha;
import Logica.Importados;
import Logica.Nacional;

public class Main_Articulo {

	public static void main(String[] args) {
		
		//FECHA ACTUALIDAD
		Fecha fecha = new Fecha(22,6,2023);
				
		//FECHA VENCIMIENTO
		Fecha fVencimiento = new Fecha(12,4,2020);
		
		Nacional obj1 = new Nacional(1,"computadora",5,fecha,fVencimiento,"montevideo",true);
		System.out.println(obj1.toString());
		
		Importados impor = new Importados(2,"heladera",10,fecha,fVencimiento,1.21,2003);
		System.out.println(impor.toString());
		
	}

}
