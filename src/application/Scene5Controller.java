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

public class Scene5Controller {
	
	@FXML
	TextField nameTextField;
  private Stage stage;
  private Scene scene;
  private Parent root;
  public int selectedVehicle;
  private int selectedDiet;

  
  
  public void setVehicale(int selectedVehicle) {
	  this.selectedVehicle=selectedVehicle;
  }
  public void Nobeef(ActionEvent event)throws IOException{
	    selectedDiet = 10;

	  FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6.fxml"));
	  root = loader.load();
	  
	  Scene6Controller scene6Controller = loader.getController();
	  scene6Controller.setVehicale(selectedVehicle);
	  scene6Controller.setDiet(selectedDiet);
	  
	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
  }
 public void Vegetarian(ActionEvent event)throws IOException{
	  
	 selectedDiet = 20;

	  FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6.fxml"));
	  root = loader.load();
	  
	  Scene6Controller scene6Controller = loader.getController();
	  scene6Controller.setVehicale(selectedVehicle);
	  scene6Controller.setDiet(selectedDiet);
	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
  }
 public void Vegan(ActionEvent event)throws IOException{
	  
	 selectedDiet = 5;

	  FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene6.fxml"));
	  root = loader.load();
	  
	  Scene6Controller scene6Controller = loader.getController();
	  scene6Controller.setVehicale(selectedVehicle);
	  scene6Controller.setDiet(selectedDiet);
	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
 }
}
