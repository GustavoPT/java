import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Entity;
import org.hibernate.cfg.Configuration;

//@Entity()
//class User{
//	// id 
//	// name
//}
//@Entity
//class CreditCard{
//	int id;
//	
//	// id 
//	// num 
//	// dd 
//	// yy 
//	// bc
//	// image url 
//}

//@Entity()




public class Main extends Application {
	
	@SuppressWarnings("deprecation")
	@Entity
	class User{
		
	}
	public void connect() {
		try {
			SessionFactory factory = new Configuration()
									 .configure("hibernate.cfg.xml")
									 .addAnnotatedClass(User.class)
									 .buildSessionFactory();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			connect();
			
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
			
			BorderPane root2 = new BorderPane();
		//	Scene scene2 = new Scene();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
