package Ventana;

import java.util.Observable;
import java.util.Observer;

public class Elobservador implements Observer{

	@Override
	public void update(Observable arg0, Object arg) {
		
		if (((String)arg).equals("Azul")) {
			System.out.print("Se cambio de colo a Azul");
		}
		else if (((String)arg).equals("Rojo")) {
			System.out.print("Se cambio de colo a Rojo");
		}
		
		else if (((String)arg).equals("Verde")) {
			System.out.print("Se cambio de colo a Verde");
		}
		
	}
	
}
