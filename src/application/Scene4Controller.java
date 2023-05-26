package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene4Controller {
    public String selectedVehicle;
    public String selectedDiet;
    public String selectedElectricity;
	@FXML
	Label nameLabel;
	
	public void setVehicale(String selectedVehicle){
		this.selectedVehicle=selectedVehicle;
	}
	 public void setDiet(String selectedDiet){
		 this.selectedDiet=selectedDiet;
	 }
	 public void setElectricity(String selectedElectricity){
		 this.selectedElectricity=selectedElectricity;
	 }
	
	@FXML
	public void display(ActionEvent event) {
		System.out.println(selectedVehicle);	
		System.out.println(selectedDiet);
		System.out.println(selectedElectricity);
		}
}
