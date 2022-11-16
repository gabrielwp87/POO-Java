package javafx2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Define título da janela
		primaryStage.setTitle("JavaFX com Eventos");
		//Define gerenciador de layout
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		//Configuração de componentes
		Label userName = new Label("User Name:");
		grid.add(userName, 0, 1);
		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);
		Button btn = new Button("Say hello");
		grid.add(btn, 2, 1);
		btn.setOnAction(e -> {
			Alert msgBox = new Alert(AlertType.INFORMATION);
			msgBox.setContentText("Hello " + userTextField.getText() + "!");
			msgBox.showAndWait();
			userTextField.setText("");
		});
		//Monta uma cena
		Scene scene = new Scene(grid, 400, 200);
		//Posiciona cena no palco
		primaryStage.setScene(scene);
		//Exibe o que está no palco
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
