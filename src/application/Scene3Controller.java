package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene3Controller {
	
	@FXML
	TextField nameTextField;
  private Stage stage;
  private Scene scene;
  private Parent root;
  public int selectedVehicle;
  public void car(ActionEvent event)throws IOException{
	  selectedVehicle = 10;

	  FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene5.fxml"));
	  root = loader.load();
	  
	  Scene5Controller scene5Controller = loader.getController();
	  scene5Controller.setVehicale(selectedVehicle);
	  
	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
  }
 public void moto(ActionEvent event)throws IOException{
	    selectedVehicle = 20;

	    FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene5.fxml"));
		  root = loader.load();
		  
		  Scene5Controller scene5Controller = loader.getController();
		  scene5Controller.setVehicale(selectedVehicle);
	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
  }
 public void bus(ActionEvent event)throws IOException{
	    selectedVehicle = 10;

	    FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene5.fxml"));
		  root = loader.load();
		  
		  Scene5Controller scene5Controller = loader.getController();
		  scene5Controller.setVehicale(selectedVehicle);
	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
 }
}
