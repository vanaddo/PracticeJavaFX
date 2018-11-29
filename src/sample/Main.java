package sample;
import com.sun.org.apache.bcel.internal.generic.LADD;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class Main extends Application {

  Stage window;
  BorderPane layout;




  public static void main(String[] args) {

    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    window = primaryStage;
    window.setTitle("thenewboston-JavaFx");

    //File Menu
    Menu fileMenu = new Menu("File");

    //File Menu Items

    //Creating a new menu item and setting the menu items to actionable
    MenuItem newFile = new MenuItem("New");
    newFile.setOnAction(e-> System.out.println("Create New File..."));
    fileMenu.getItems().add(newFile);

    //Creating a new menu item
    fileMenu.getItems().add(new MenuItem("Open..."));
    fileMenu.getItems().add(new MenuItem("Save..."));
    fileMenu.getItems().add(new SeparatorMenuItem());
    fileMenu.getItems().add(new MenuItem("Settings..."));
    fileMenu.getItems().add(new SeparatorMenuItem()); //Creates a visible line of separation between menu items. In this case "Settings" and "Exit".
    fileMenu.getItems().add(new MenuItem("Exit..."));

    //Edit Menu

    /*Putting an underscore right be for the name of the menu it creates a shortcut.
     So if the user does "alt + e" in this case the system will open the "edit" menu*/
    Menu editMenu = new Menu("_Edit");

    //Edit Menu Items
    editMenu.getItems().addAll(new MenuItem("Undo"));
    editMenu.getItems().add(new MenuItem("Cut"));

    MenuItem copy = new MenuItem("Copy");
    copy.setOnAction(e-> System.out.println("Copying some random ass shit..."));
    editMenu.getItems().add(copy); //adds the new Item and its function to the menu

    MenuItem paste = new MenuItem("Paste");
    paste.setDisable(true);// disables paste button
    editMenu.getItems().add(paste);



    //Main Menu Bar
    MenuBar menuBar = new MenuBar();
    menuBar.getMenus().addAll(fileMenu,editMenu); //add individual menus to menu bar
    layout = new BorderPane();
    layout.setTop(menuBar);
    Scene scene = new Scene(layout, 400, 300);
    window.setScene(scene);
    window.show();
  }
}