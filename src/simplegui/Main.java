package simplegui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Login Page");

        Login login = new Login(primaryStage);
        StackPane root = new StackPane(login);

        Scene scene = new Scene(root, 1000, 800);
        scene.getStylesheets().add("res/styles.css");
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }

    public static void showMainPage(Stage primaryStage) {
        Label welcomeLabel = new Label("Welcome!");
        StackPane root = new StackPane();

        root.getChildren().add(welcomeLabel);

        Scene scene = new Scene(root, 1000, 800);
        primaryStage.setTitle("Main Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
