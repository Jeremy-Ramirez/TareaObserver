package application;
	
import Ventana.Elobservador;
import Ventana.Ventana;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
			Elobservador o = new Elobservador();
			Ventana v = new Ventana();
			v.addObserver(o);
			Scene scene = new Scene(v.getRoot(),200,300);
			
			primaryStage.setTitle("Tarea1_Aspeto");
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}