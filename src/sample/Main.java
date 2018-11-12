package sample;
//Using JavaFx Demo by New Boston on Youtube.
import com.sun.java.util.jar.pack.Attribute;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    Button button;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        button = new Button();
        button.setLabel("Click Me");

        StackPane layout = new StackPane();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
