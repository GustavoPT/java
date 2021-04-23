package com.example.demo;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entities.Book;
import com.example.demo.entities.User;


@Entity
class User{
	int id;
	string name;
	string password;
	string use
	
	@OneToMany(mappedBy = "transaction")
	private Set<Transaction> transactions = new Hash

	@OneToMany(mappedBy="card")
	private Set<Card> cards = new HashSet<>();

	@OneToMany(mappedBy="account")
	private Set<Account> accounts = new HashSet<>();

}

@Entity
class Product{
	int id;
	String name;
	
}

@Entity
class Seller{
	int id;
	String name;
	@OneToMany(mappedBy="product")
	private Set<Product> products = new HashSet<>();
	
	
}
@Entity
@Table(name="card")
class Card{
    int id;
    int number;
    int year;
    int code;
    int month;
    
    // user 
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
        
}

class Transaction{
    // user one to many 
    // seller 
    // price 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	int id;
	
	
	double ammount;
	
	int date;
	
	// 
	@ManyToOne
	@JoinColumn(name="user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="card")
	private Card card;
	
	@ManyToOne
	@JoinColumn(name="transaction")
	private Transaction transaction;
	
}


@Entity
@Table(name="account")
class Account{
	
	double balance;
	String type;

	@ManyToOne
	@JoinColumn(name="id")
	private User user;
	
	
}


// 

@Controller 
public class HomeController {
	@RequestMapping("/book/{bookid}")
	public @ResponseBody String getAttr(@PathVariable(value="bookid") int id, 
	                                 String someAttr,Model model) {
		Optional<Book> b1 = bookRep.findById((long) id);
		model.addAttribute("book",b1);
		//;
		return "book";
	}
	
	@RequestMapping("/register")
	public String register(Model model){
		model.addAttribute("User", new User());
		return "reg";
	}
	@RequestMapping("/login")
	public String login(Model model){
		model.addAttribute("User", new User());
		return "login";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute User user,Model model) {
		
		System.out.print("name" + user.getEmail());
		System.out.println("adding to the db");
	    model.addAttribute("user", user);
	    userRep.save(user);
	    User u2 = userRep.getOne((long) 2);
	    System.out.print(u2.getFirstName());
		return "index";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute User user,Model model) {
		
		System.out.print("name" + user.getFirstName());
		System.out.print("password" + user.getPassword());
		//	System.out.println("ad ding to the db");
		Integer pw = 123;
		Integer pwInput = Integer.parseInt(user.getPassword());
		System.out.println(user.getFirstName().equals("tom"));	
		System.out.println(pw.equals(pwInput));
		
		if(user.getFirstName().equals("tom") && pw.equals(pwInput) ) {
			System.out.println("we got in");
			return "dashboard";
		}
		else {
			System.out.println("we did not get in");	
		}
		// TODO: pass a message to index 
		return "index";
	}
}
