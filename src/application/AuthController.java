package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AuthController {
	private Stage stage;
	private Scene scene;
	private Parent root;
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void loginButtonClicked(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Perform authentication logic here
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login successful!");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AllUsers.fxml"));
  	  	  root = loader.load();
  	  	  
  	  	  
  	  	  
  	  	  //root =FXMLLoader.load(getClass().getResource("Scene4.fxml"));
  	  	  stage=(Stage)((Node)event.getSource()).getScene().getWindow();

  	  	  scene = new Scene(root);
  	  	  stage.setScene(scene);
  	  	  stage.show();
            // TODO: Proceed to the main application or another page
        } else {
            System.out.println("Invalid username or password. Please try again.");
            // TODO: Display an error message to the user
        }
    }
}