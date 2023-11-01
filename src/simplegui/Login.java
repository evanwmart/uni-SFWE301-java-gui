package simplegui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
    
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends VBox {
    public Login(Stage primaryStage) {

        setSpacing(10);
        setStyle("-fx-background-image: url('/assets/login-background.png'); -fx-background-size: cover; -fx-padding: 10; -fx-alignment: center;");
        
        VBox container = new VBox();
        container.getStyleClass().add("container");

        Label titleLabel = new Label("Login Page");
        titleLabel.getStyleClass().add("title-label");
        
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        usernameField.getStyleClass().add("username-field"); 
        usernameField.setPrefColumnCount(10); // Set preferred column count to 10
        
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        passwordField.getStyleClass().add("password-field");
        passwordField.setPrefColumnCount(10); // Set preferred column count to 10
        
        Button loginButton = new Button("Login");
        loginButton.getStyleClass().add("login-button"); 
        loginButton.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            

            if (authenticate(username, password)) {
                System.out.println("Login Succeeded");
                Main.showMainPage(primaryStage, primaryStage.getScene());
            } else {
                System.out.println("Login Failed");
            }
        });

        container.setMaxWidth(600);
        container.getChildren().addAll(titleLabel, usernameField, passwordField, loginButton);

        getChildren().addAll(container);
    }
    
    private boolean authenticate(String username, String password) {

        String csvFile = "src/data/users.csv";
        String line;
        String csvSplitBy = ",";
        boolean auth = false;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] user = line.split(csvSplitBy);
                if (user[0].equals(username) && user[1].equals(password)) {
                    auth = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return auth;
    }
}

