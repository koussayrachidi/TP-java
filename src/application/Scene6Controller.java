package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene6Controller {
	
	@FXML
	TextField nameTextField;
  private Stage stage;
  private Scene scene;
  private Parent root;
  public int selectedVehicle;
  private int selectedDiet;
  private int selectedElectricity;


  
 
	
	
	public void setVehicale(int selectedVehicle){
		this.selectedVehicle=selectedVehicle;
	}
	 public void setDiet(int selectedDiet){
		 this.selectedDiet=selectedDiet;
	 }
  public void Renewable(ActionEvent event)throws IOException{
	  selectedElectricity = 10;

	  FXMLLoader loader = new FXMLLoader(getClass().getResource("user.fxml"));
	  root = loader.load();
	  
	  CarbonFootprintCalculatorController carbonFootprintCalculatorController = loader.getController();
	  carbonFootprintCalculatorController.setVehicale(selectedVehicle);
	  carbonFootprintCalculatorController.setDiet(selectedDiet);
	  carbonFootprintCalculatorController.setElectricity(selectedElectricity);

	  
	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
  }
 public void NonRenewable(ActionEvent event)throws IOException{
	  
	 selectedElectricity = 10;

	  FXMLLoader loader = new FXMLLoader(getClass().getResource("user.fxml"));
	  root = loader.load();
	  
	  CarbonFootprintCalculatorController carbonFootprintCalculatorController = loader.getController();
	  carbonFootprintCalculatorController.setVehicale(selectedVehicle);
	  carbonFootprintCalculatorController.setDiet(selectedDiet);
	  carbonFootprintCalculatorController.setElectricity(selectedElectricity);

	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
  }
 public void Solar(ActionEvent event)throws IOException{
	  
	 selectedElectricity = 10;

	  FXMLLoader loader = new FXMLLoader(getClass().getResource("user.fxml"));
	  root = loader.load();
	  
	  CarbonFootprintCalculatorController carbonFootprintCalculatorController = loader.getController();
	  carbonFootprintCalculatorController.setVehicale(selectedVehicle);
	  carbonFootprintCalculatorController.setDiet(selectedDiet);
	  carbonFootprintCalculatorController.setElectricity(selectedElectricity);
	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  scene = new Scene(root);
	  stage.setScene(scene);
	  stage.show();
 }
}
