package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {

  Stage window;
  TableView<Product>table;
  TextField nameInput, priceInput, quantityInput;



  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {

    window = primaryStage;
    window.setTitle("thenewboston-JavaFx");

    //Name Column
    TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
    nameColumn.setMinWidth(200);
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

    //Price Column
    TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
    priceColumn.setMinWidth(100);
    priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

    //Quantity Column
    TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantity");
    quantityColumn.setMinWidth(100);
    quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

    //Name Input
    nameInput = new TextField();
    nameInput.setPromptText("Name");
    nameInput.setMinWidth(100);

    //Price Input
    priceInput = new TextField();
    priceInput.setPromptText("Price");


    //Quantity Input
    quantityInput = new TextField();
    quantityInput.setPromptText("Quantity");

    //Add & Delete Buttons
    Button addButton = new Button("Add");
    addButton.setOnAction(e-> addButtonClicked());
    Button deleteButton = new Button("Delete");
    deleteButton.setOnAction(e-> deleteButtonClicked());

  //setting our variables into HBoc=x sets their layout to be set up horizontally
    HBox hBox = new HBox();
    hBox.setPadding(new Insets(10,10,10,10));
    hBox.setSpacing(10); //creates spacing between the "add" & "delete" buttons, and inputs
    hBox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteButton);







    //Set Table Up
    table = new TableView<>();
    table.setItems(getProduct());
    table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);

    VBox vBox = new VBox();
    vBox.getChildren().addAll(table,hBox); // placing the Hbox in here allows the variables listed in the HBox settings to show on the table itself

    Scene scene = new Scene(vBox);
    window.setScene(scene);
    window.show();
  }

  //Add Button Clicked
  public void addButtonClicked(){
    Product product = new Product();
    product.setName(nameInput.getText());
    product.setPrice(Double.parseDouble(priceInput.getText())); //Look at your notes to reference NumberFormatException
    product.setQuantity(Integer.parseInt(quantityInput.getText()));
    table.getItems().add(product); //adds the inputted product info to the table
    nameInput.clear(); //clears the inputted fields after the product has been added to the table
    priceInput.clear();
    quantityInput.clear();
  }

//Delete Button Clicked

  public void deleteButtonClicked(){
    ObservableList<Product> productSelected, allProducts; // creates two observable list. The 1st is the product that the user selected the 2nd is a list of all the existing products in the table
    allProducts = table.getItems(); //gets all the existing products from the table
    productSelected = table.getSelectionModel().getSelectedItems(); //returns any item that the user has selected(Clicked on)

    productSelected.forEach(allProducts::remove); // for each product that the user has selected remove from the all products list(Main Table)



  }

  //Gets all of the products
  public ObservableList<Product> getProduct(){
    //points the system to the database or file that it needs to get the info from
   ObservableList<Product>products = FXCollections.observableArrayList();
   products.add(new Product("Laptop",350.00,30));
   products.add(new Product("IPad",300.00,25));
   products.add(new Product("Headphones",180.00,15));
   products.add(new Product("Monitor",150.00,40));
   products.add(new Product("Extension Cords",10.00,200));
   return products;

  }
}

