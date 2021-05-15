package application;
	
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;




class User{
	// id 
	// name
	int id;
	String name;
	
	
	public User() {
		
	}


	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

class CreditCard{
	int id;
	
	// id 
	// num 
	// dd 
	// yy 
	// bc
	// image url 
}

class Employee{
	// id 
	// name 
	// status
	
}

class Card{
	
}

class Product{
	
}

class Transaction{
	
}

class Seller{
	
}
public class Main extends Application {
	
	// check if the employee 
	// manager 
	//
	@Override
	public void start(Stage primaryStage) {
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
		}
		finally{
			factory.close();
		}
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
