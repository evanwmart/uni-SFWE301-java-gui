package simplegui;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends VBox {
    public Login(Stage primaryStage) {

        Label titleLabel = new Label("Login Page");
        
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        
        Button loginButton = new Button("Login");
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            

            if (authenticate(username, password)) {
                System.out.println("Login Succeeded");
                Main.showMainPage(primaryStage);
            } else {
                System.out.println("Login Failed");
            }
        });

        getChildren().addAll(titleLabel, usernameField, passwordField, loginButton);
    }
    
    private boolean authenticate(String username, String password) {
        // Replace this with your authentication logic (e.g., check against a database)
        // For demonstration purposes, this example always returns true.
        return true;
    }
}
