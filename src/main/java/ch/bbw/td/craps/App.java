package ch.bbw.td.craps;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The craps game
 * @author Tim Dubath
 * @version 24.01.2020
 */
public class App extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Untitled.fxml"));
			Controller controller = new Controller();
			Dice myDice = new Dice();
			Craps craps = new Craps(myDice);
			loader.setController(controller);
			Parent root = loader.load();
			Scene scene = new Scene(root);

			primaryStage.setTitle("Öffne das Tor!");
			primaryStage.setScene(scene);

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
   public static void main(String[] args)
   {
	  launch(args);
   }



}