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

    //Set Table Up
    table = new TableView<>();
    table.setItems(getProduct());
    table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);

    VBox vBox = new VBox();
    vBox.getChildren().addAll(table);

    Scene scene = new Scene(vBox);
    window.setScene(scene);
    window.show();
  }

  //Gets all of the products
  public ObservableList<Product> getProduct(){
    //points the system to the database or file that it needs to get the info from
   ObservableList<Product>products = FXCollections.observableArrayList();
   products.add(new Product("Laptop",350.00,1));
   products.add(new Product("IPad",300.00,1));
   products.add(new Product("Headphones",180.00,1));
   products.add(new Product("Monitor",150.00,2));
   products.add(new Product("Extension Cords",10.00,2));
   return products;

  }
}

