package ch.bbw.td.craps;


import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.html.ListView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;


public class Controller implements Initializable{
	
	@FXML
	private ImageView image1;
	
	@FXML
	private ImageView image2;
	
	@FXML
	private Button loginBt;
	
	@FXML
	private Button playBt;
	
	@FXML
	TextField result2;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		image1.setImage(new Image(getClass().getResourceAsStream("DicePicture.png")));
		image2.setImage(new Image(getClass().getResourceAsStream("DicePicture.png")));
		result2.setText("Resultat erscheint hier");
		result2.setEditable(false);
		
		playBt.setOnAction(this::playButton);
		loginBt.setOnAction(this::loginButton);
		
	}
	
	public void playButton(ActionEvent event) {
		Dice dice = new Dice();
		Craps craps = new Craps(dice);
		
		if(craps.play()) {
			result2.setText("Gewonnen");
			System.out.println("Gewonnen");
		}
		else {
			result2.setText("Verloren");
			System.out.println("Verloren");
		}
	}
	
	public void loginButton(ActionEvent event) {
		
	}

}
