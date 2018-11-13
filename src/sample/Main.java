package sample;
import javafx.application.Application;
import  javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application implements EventHandler<ActionEvent>{

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");
        button = new Button();
        button.setText("Click me");

        button.setOnAction(this::handle);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        //handle is an event called whenever the user clicks the button. Essentially what they want to do

        if (event.getSource()== button){
            System.out.println("You clicked the button!");
        }

    }
}
