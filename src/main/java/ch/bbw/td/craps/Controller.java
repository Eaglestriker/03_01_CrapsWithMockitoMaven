package ch.bbw.td.craps;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.html.ListView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable{
	
	@FXML
	private ImageView image1;
	
	@FXML
	private ImageView image2;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		image1.setImage(new Image(getClass().getResourceAsStream("DicePicture.png")));
		image2.setImage(new Image(getClass().getResourceAsStream("DicePicture.png")));
		
	}

}
