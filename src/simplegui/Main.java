package simplegui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
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

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showMainPage(Stage primaryStage) {
        // Replace this with code to display the main application after successful login
        // You can create a new JavaFX scene and set it here.
    }
}
