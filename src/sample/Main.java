package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;


public class Main extends Application {

  Stage window;
  Scene scene;
  Button button;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage){

    window = primaryStage;
    window.setTitle("JavaFx- CheckBox Subs");
//   //Form
//    TextField nameInput = new TextField("Sam");


    //Checkboxes

    CheckBox box1 = new CheckBox("Bacon");
    CheckBox box2 = new CheckBox("Salami");
    box2.setSelected(true);
    //Button
    button = new Button("Order Now!");
    button.setOnAction(e -> handleOptions(box1, box2));
//  button.setOnAction(e -> isInt(nameInput,nameInput.getText()));
//
;
  //Layout
    VBox layout = new VBox(10);
    layout.setPadding(new Insets(20,20,20,20));
    layout.getChildren().addAll(box1,box2, button);

    scene = new Scene(layout,300,250);


    /*//Name label
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
    Scene scene = new Scene(grid,300,200);*/

    window.setScene(scene);
    window.show();





   /* StackPane layout = new StackPane();
    layout.getChildren().add(button);
    Scene scene = new Scene(layout,300,250);
    window.setScene(scene);*/
    window.show();

  }
//Handle Check Box Options
  private void  handleOptions(CheckBox box1,CheckBox box2) {
    String message = "You ordered:\n";
    if(box1.isSelected()){
      message += "Bacon\n";
  }
    if (box2.isSelected()){
      message += "Tuna\n";
    }
    System.out.println(message);


//  private boolean isInt(TextField input, String message){
//    try {
//      int age = Integer.parseInt(input.getText());
//      System.out.println("User is: " +age);
//      return true;
//    }catch (NumberFormatException e){
//      System.out.println("Error: " + message + " is not a number");
//      return false;
//    }
  }


  /*private void closeProgram(){
   Boolean answer = ConfirmBox.display("Title" , "Are you sure you want to exit the program?");
   if (answer)
      window.close();
  }
*/

}

