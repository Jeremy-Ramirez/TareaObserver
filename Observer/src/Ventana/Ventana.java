package Ventana;



import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Ventana {
	private BorderPane root;
	private Button colorAzul;
	private Button colorRojo;
	private Button colorVerde;
	private VBox areaBotones;
	
	public Ventana() {
		Inicializar();
	}
		
	public void Inicializar() {
		root = new BorderPane();
		colorAzul = new Button("Azul");
		colorRojo = new Button("Rojo");
		colorVerde = new Button("Verde");	
		colorAzul.setMinWidth(Control.USE_PREF_SIZE);
		colorRojo.setMinWidth(Control.USE_PREF_SIZE);
		colorVerde.setMinWidth(Control.USE_PREF_SIZE);
		
		colorAzul.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent colorAzul) {
				root.setBackground(new Background(new BackgroundFill(Color.BLUE,CornerRadii.EMPTY, Insets.EMPTY)));			}
		});
		
		colorRojo.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent colorRojo) {
				root.setBackground(new Background(new BackgroundFill(Color.RED,CornerRadii.EMPTY, Insets.EMPTY)));			}
		});
		colorVerde.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent colorVerde) {
				root.setBackground(new Background(new BackgroundFill(Color.GREEN,CornerRadii.EMPTY, Insets.EMPTY)));			}
		});
		
		areaBotones = new VBox();
		areaBotones.setSpacing(12);
		areaBotones.getChildren().addAll(colorAzul, colorRojo,colorVerde);
		root.getChildren().add(areaBotones);
	}
	
	public BorderPane getRoot() {
        return root;
    }
	
}
