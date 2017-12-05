package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane gridPane = new GridPane();
			
			Label loen = new Label();
			Label amtSkat = new Label();
			Label kommuneSkat = new Label();
			Label kirkeSkat = new Label();
			Label sundhedsBidrag = new Label();
			Label bundSkat = new Label();
			Label loenEfterSkat = new Label();
			
			gridPane.add(amtSkat, 1, 1);
			gridPane.add(kommuneSkat, 2, 1);
			gridPane.add(kirkeSkat, 3, 1);
			gridPane.add(sundhedsBidrag, 4, 1);
			gridPane.add(bundSkat, 5, 1);
			
			Button result = new Button("Resultat");
			
			
			Scene scene = new Scene(gridPane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
