package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AllUsersController implements Initializable{
	private Stage stage;
	private Scene scene;
	private Parent root;
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

	 private UserService s =new UserService();

	 
	    private ObservableList<User> list = FXCollections.observableArrayList(); 



	 @Override
	    public void initialize(URL url, ResourceBundle resourceBundle) {
	        firstnameCol.setCellValueFactory(new PropertyValueFactory<>("prenom"));
	        lastnameCol.setCellValueFactory(new PropertyValueFactory<>("nom"));
	        transportationCol.setCellValueFactory(new PropertyValueFactory<>("transportation"));
	        electricityCol.setCellValueFactory(new PropertyValueFactory<>("electricity"));
	        foodCol.setCellValueFactory(new PropertyValueFactory<>("food"));
	        resultCol.setCellValueFactory(new PropertyValueFactory<>("result"));
	        list.addAll(s.findAll());
	            table.setItems(list);

	    }

	   @FXML
	    public void remove() {
	        User selectedUser = table.getSelectionModel().getSelectedItem();

	        if (selectedUser == null) {
	            System.out.println("Veuillez sélectionner une personne à supprimer.");
	            return;
	        }
s.delete(selectedUser);
	        list.remove(selectedUser);
	    }
	   
	 
	        
	       


	 @FXML
	    public void exporter() {
	        //data.setExportList(list);
	        for (User p: table.getItems())
	        	System.out.println(p);
	    }

	    @FXML
	    public void importer() {
	    	
	        list.clear();
	        list.addAll(s.findAll());
	    }

	    @FXML
	    public void quitter() {
	        System.exit(0);
	    }

	

	    @FXML
	    public void switchToScene2(ActionEvent event )throws IOException {
	    	Parent root= FXMLLoader.load(getClass().getResource("Scene2.fxml"));
	    	stage =(Stage)((Node)event.getSource()).getScene().getWindow();
	    	scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
	    }
	 
}
