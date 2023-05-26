package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
public class SwitchScene {
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
    private Label switche;
  
    
    public void switchToScene1(MouseEvent event )throws IOException {
    	Parent root= FXMLLoader.load(getClass().getResource("Scene3.fxml"));
    	stage =(Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }
    

}
