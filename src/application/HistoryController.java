package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HistoryController implements Initializable{
	 @FXML
	 private TableView<User> table;
	 @FXML
	 private TableColumn<User, String> transportationCol;
	 @FXML
	 private TableColumn<User, String> electricityCol;
	 @FXML
	 private TableColumn<User, String> firstnameCol;
	 @FXML
	 private TableColumn<User, String> lastnameCol;
	 @FXML
	 private TableColumn<User, String> foodCol;
	 @FXML
	 private TableColumn<User, String> resultCol;
    public String prenom;
    public String nom;
	
	
	public void setNom(String nom){
		this.nom=nom;
	}
	 public void setPrenom(String prenom){
		 this.prenom=prenom;
	 }
	 private UserService s =new UserService();

	 
	    private ObservableList<User> list = FXCollections.observableArrayList(); 



	 void display() {
		    list.addAll(s.findAllNom(nom));

		 System.out.println(this.nom);
       	 System.out.println(this.prenom);
       	 for (User a:list)
       	 System.out.println(a);

	 }
	 @Override
	    public void initialize(URL url, ResourceBundle resourceBundle) {
	        firstnameCol.setCellValueFactory(new PropertyValueFactory<>("prenom"));
	        lastnameCol.setCellValueFactory(new PropertyValueFactory<>("nom"));
	        transportationCol.setCellValueFactory(new PropertyValueFactory<>("transportation"));
	        electricityCol.setCellValueFactory(new PropertyValueFactory<>("electricity"));
	        foodCol.setCellValueFactory(new PropertyValueFactory<>("food"));
	        resultCol.setCellValueFactory(new PropertyValueFactory<>("result"));
		    list.addAll(s.findAllNom(nom));
	            table.setItems(list);
	      

	    }
	    
	 
}
