package Ventana;

import java.util.Observable;
import java.util.Observer;

public class Elobservador implements Observer{

	@Override
	public void update(Observable arg0, Object arg) {
		
		if (((String)arg).equals("colorAzul")) {
			System.out.println("Se cambio de colo a Azul");
		}
		else if (((String)arg).equals("colorRojo")) {
			System.out.println("Se cambio de colo a Rojo");
		}
		
		else if (((String)arg).equals("colorVerde")) {
			System.out.println("Se cambio de colo a Verde");
		}
		
	}
	
}
