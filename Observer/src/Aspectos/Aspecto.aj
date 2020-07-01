package Aspectos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public aspect Aspecto {
	
	
	 File file = new File("src/asp.txt");
	 

	    pointcut success() : call(* setB*(..) );	    
	    after() : success() {
	    	
	    	try {
	    		PrintWriter f = new PrintWriter(new FileWriter(file, true));
				f.println("Se ha realizado un cambio");
				System.out.println("Se ha cambiado de color");
				f.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
	
	
	

}
}
