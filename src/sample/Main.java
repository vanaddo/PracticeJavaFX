package sample;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sun.reflect.generics.tree.Tree;


public class Main extends Application {

  Stage window;
   Scene scene;
//  Button button;
//  ComboBox<String> comboBox;
//  ListView<String>listView;

  TreeView<String> tree;


  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage){

    window = primaryStage;
    window.setTitle("JavaFx- ChoiceBox");

    TreeItem<String> root,sam,paul;

    //Root

    root = new TreeItem<>();
    root.setExpanded(true);

    //sam Branch
    sam = makeBranch("Sam", root);
    makeBranch("Thai Food", sam);
    makeBranch("Chocolate", sam);
    makeBranch("Warm Weather", sam);

    //Paul Branch
    paul = makeBranch("Paul", root);
    makeBranch("Italian Food",paul);
    makeBranch("Ice Cream",paul);
    makeBranch("Fall Weather", paul);

  //create tree
    tree = new TreeView<>(root);
    tree.setShowRoot(false);
    tree.getSelectionModel().selectedItemProperty()
            .addListener((v, oldValue, newValue)->{
              if (newValue != null)
                System.out.println(newValue.getValue());
            });

    /*button = new Button("Submit");

    listView = new ListView<>();
    listView.getItems().addAll("Black Panther","Brown Sugar","Boomerang","Blank Man!");
    listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    button.setOnAction(e-> buttonClicked());*/
   /* comboBox = new ComboBox<>();
    comboBox.getItems().addAll(
            "Love and Basketball",
            "Black Panther",
            "Harlem Nights"
    );

    comboBox.setPromptText("What is your favorite movie?");

    comboBox.setEditable(true);
    button.setOnAction(e -> printMovie());
    comboBox.setOnAction(e-> System.out.println("User selected: " + comboBox.getValue()));*/

//   //Form
//    TextField nameInput = new TextField("Sam");


//    //Checkboxes
//
//    CheckBox box1 = new CheckBox("Bacon");
//    CheckBox box2 = new CheckBox("Salami");
//    box2.setSelected(true);

    //Button

//    button.setOnAction(e -> handleOptions(box1, box2));
//  button.setOnAction(e -> isInt(nameInput,nameInput.getText()));
//

//    //ChoiceBox
//
//    ChoiceBox<String> choiceBox = new ChoiceBox<>();
//
//    //getItems returns theObservableList object which you can add items to
//    choiceBox.getItems().add("Apples");
//    choiceBox.getItems().add("Oranges");
//    choiceBox.getItems().add("Grapes");
//    choiceBox.getItems().add("Cherries");
//    choiceBox.getItems().addAll("Bananas","Strawberries","Grapefruits");
//    choiceBox.setValue("Apples");
//
//   //Listen for selection changes
//    choiceBox.getSelectionModel().selectedItemProperty().addListener((v,oldValue, newValue) -> System.out.println(newValue));
   //button.setOnAction(e-> getChoice(choiceBox));

  //Layout
    VBox layout = new VBox(10);
    layout.setPadding(new Insets(20,20,20,20));
    layout.getChildren().add(tree);

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
    window.setScene(scene);
    window.show();
    */

  }
//Create Branches

  public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
    TreeItem<String> item = new TreeItem<>(title);
    item.setExpanded(true);
    parent.getChildren().add(item);
    return item;
  }
/*
  private void buttonClicked(){
    java.lang.String message = "";
    ObservableList<String> movies;
    movies = listView.getSelectionModel().getSelectedItems();

    for (String m: movies){
      message += m +"\n";
    }
    System.out.println(message);
  }*/
 /* //Print out a movie
  private void printMovie(){
    System.out.println(comboBox.getValue());
  }*/
 /*//Handle Check Box Options
  private void  handleOptions(CheckBox box1,CheckBox box2) {
    String message = "You ordered:\n";
    if (box1.isSelected()) {
      message += "Bacon\n";
    }
    if (box2.isSelected()) {
      message += "Tuna\n";
    }
    System.out.println(message);
  }*/


/* private void getChoice( ChoiceBox<String> choiceBox){
   String food = choiceBox.getValue();
   System.out.println(food);
 }*/
//  private boolean isInt(TextField input, String message){
//    try {
//      int age = Integer.parseInt(input.getText());
//      System.out.println("User is: " +age);
//      return true;
//    }catch (NumberFormatException e){
//      System.out.println("Error: " + message + " is not a number");
//      return false;
//    }



  /*private void closeProgram(){
   Boolean answer = ConfirmBox.display("Title" , "Are you sure you want to exit the program?");
   if (answer)
      window.close();
  }
*/

}

