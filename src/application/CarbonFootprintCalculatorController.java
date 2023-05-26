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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
public class CarbonFootprintCalculatorController{
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	
	@FXML
    private TextField firstnameField;
	@FXML
    private TextField lastnameField;
	@FXML
	private ComboBox<String> transportationComboBox;
	@FXML
	private ComboBox<String> electricityComboBox;
	@FXML
	private ComboBox<String> foodComboBox;
    @FXML
	 private Button addBtn;
    @FXML
    private Label resultLabel;
    @FXML
    private BarChart<String, Number> barChart;
    @FXML
    private Label comparisonLabel;
    @FXML
    private Label recommendationsLabel;
    @FXML
    private TextArea recommendationsTextArea;
    @FXML
    private Label transportationComparisonLabel;
    @FXML
    private Label electricityComparisonLabel;
    @FXML
    private Label foodComparisonLabel;
    
    
    @FXML
	 private Button exportBtn;
	 @FXML
	 private Button importBtn;
	 @FXML
	 private Button removeBtn;
	 @FXML
	 private Button quitBtn;
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
	 
	    public int selectedVehicle;
	    public int selectedDiet;
	    public int selectedElectricity;
		
		public void setVehicale(int selectedVehicle){
			this.selectedVehicle=selectedVehicle;
		}
		 public void setDiet(int selectedDiet){
			 this.selectedDiet=selectedDiet;
		 }
		 public void setElectricity(int selectedElectricity){
			 this.selectedElectricity=selectedElectricity;
		 }
		 private UserService s =new UserService();

	
    @FXML
    private void calculateButtonClicked() {
       
        double transportationValue = selectedVehicle;
        double electricityValue = selectedElectricity;
        double foodValue = selectedDiet;
        
        System.out.println(selectedVehicle);	
		System.out.println(selectedDiet);
		System.out.println(selectedElectricity);

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("Transportation", transportationValue * 0.5));
        series.getData().add(new XYChart.Data<>("Electricity", electricityValue * 0.8));
        series.getData().add(new XYChart.Data<>("Food", foodValue * 3.0));

        barChart.getData().clear();
        barChart.getData().add(series);

        double totalValue = transportationValue + electricityValue + foodValue;   
        resultLabel.setText("Total Carbon Footprint: " + totalValue + " kgCO2e");

        // Comparison Section
        comparisonLabel.setText("Comparison");
        String comparisonText = "";
        if (totalValue < 50) {
            comparisonText = "Your carbon footprint is low compared to the average.";
        } else if (totalValue >= 50 && totalValue < 100) {
            comparisonText = "Your carbon footprint is moderate compared to the average.";
        } else {
            comparisonText = "Your carbon footprint is high compared to the average.";
        }
        comparisonLabel.setText(comparisonText);
        
        

        recommendationsLabel.setText("Recommendations:");
        recommendationsTextArea.setText("");

        if (transportationValue * 0.5 > 10) {
            recommendationsTextArea.appendText("- Consider using public transportation or carpooling.\n");
        }
        if (electricityValue * 0.8 > 20) {
            recommendationsTextArea.appendText("- Use energy-efficient appliances and turn off unused electronics.\n");
        }
        if (foodValue * 3.0 > 5) {
            recommendationsTextArea.appendText("- Choose locally sourced and seasonal food options.\n");
        }
        
        String prenom = firstnameField.getText();
        String nom = lastnameField.getText();
        


        
User u =new User(prenom, nom, transportationValue,electricityValue,foodValue);
u.setResult(totalValue);
s.create(u);

        list.add(u);
       
       
    }
 
       




    
    
    
    
    
    
    
    
    
    
    
	 private DataClass data = new DataClass();
	    private ObservableList<User> list = FXCollections.observableArrayList(); 


	    public ObservableList<User> getList(){
	        return list;
	    }
	    
	    @FXML
	    public void history(ActionEvent event) throws IOException{
	    	 String prenom = firstnameField.getText();
	         String nom = lastnameField.getText();
	  	  FXMLLoader loader = new FXMLLoader(getClass().getResource("History.fxml"));
	  	  root = loader.load();
	  	  
	  	  HistoryController h=loader.getController();
	  	  h.setNom(nom);
	  	  h.setPrenom(prenom);
h.display();
	  	  
	  	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  	  scene = new Scene(root);
	  	  stage.setScene(scene);
	  	  stage.show();
	    }
	    @FXML
	    public void auth(ActionEvent event) throws IOException{
	    	 
	  	  FXMLLoader loader = new FXMLLoader(getClass().getResource("auth.fxml"));
	  	  root = loader.load();
	  	  
	  	  
	  	  
	  	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
	  	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	  	  scene = new Scene(root);
	  	  stage.setScene(scene);
	  	  stage.show();
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
