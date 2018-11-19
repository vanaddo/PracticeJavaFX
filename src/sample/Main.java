package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {

  Stage window;
  //Button button;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage){

    window = primaryStage;
    window.setTitle("JavaFx- The New Boston Tutorial");
    GridPane grid = new GridPane();
    grid.setPadding(new Insets(10,10,10,10));
    grid.setVgap(8);
    grid.setHgap(10);

    //Name label
    Label nameLabel = new Label("Username:");
    GridPane.setConstraints(nameLabel,0,0);

    //Name input
    TextField nameInput = new TextField("Sam");
    GridPane.setConstraints(nameInput,1,0);

    //Password Label
    Label passLabel = new Label("Password");
    GridPane.setConstraints(passLabel,0,1);

    //Password Input

    TextField passInput = new TextField();
    passInput.setPromptText("password");
    GridPane.setConstraints(passInput,1,1);

    Button loginButton = new Button("Log In");
    GridPane.setConstraints(loginButton,1,2);

    grid.getChildren().addAll(nameLabel,nameInput,passLabel,passInput,loginButton);
    Scene scene = new Scene(grid,300,200);

    window.setScene(scene);
    window.show();





   /* StackPane layout = new StackPane();
    layout.getChildren().add(button);
    Scene scene = new Scene(layout,300,250);
    window.setScene(scene);*/
    window.show();

  }
  /*private void closeProgram(){
   Boolean answer = ConfirmBox.display("Title" , "Are you sure you want to exit the program?");
   if (answer)
      window.close();
  }
*/

}

