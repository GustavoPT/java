package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

class card{
	
}
class manager{
	
}

class Employee{
	String name;
	String id;
	public Employee() {
		
	}
}

class Product{
	String name;
	String id;
	public Product() {
		
	}
}

class User{
	int id;
	String name;
	
	public User() {
		
	}
}
// connect to fx company boot db 
// connect thru call rest api 
// get the users 
// get the employees 
// get the product 
// 
class db{
	// user 
	// employee 
	// product 
	
	
	public db() {
		
	}
}
//
public class Main extends Application implements EventHandler {
	Button button;
	Stage window;
	Scene scene1,scene2;
	// f/x compa/ny a/d/min pa/nel/ 
	@Override
	public void start(Stage primaryStage) {
		try {
			window = primaryStage;
			Label label1 = new Label("wlwl");
			Button button1 = new Button("scene2");
			button1.setOnAction(e -> window.setScene(scene2));
		
			VBox layout1 = new VBox(20);
			Label labelName = new Label("Name:");
			TextField textField = new TextField ();
			
			Label labelLastName;
			layout1.getChildren().addAll(labelName,textField);
			layout1.getChildren().addAll(label1,button1);
			scene1 = new Scene(layout1,200,200);
			Button button2 = new Button("this scene");
			button2.setOnAction(e -> window.setScene(scene1));
			
			StackPane layout2 = new StackPane();
			layout2.getChildren().add(button2);
			scene2 = new Scene(layout2,600,300);
			window.setScene(scene1);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(Event arg0) {
		// TODO Auto-generated method stub
		System.out.println("hll");
	}
}
