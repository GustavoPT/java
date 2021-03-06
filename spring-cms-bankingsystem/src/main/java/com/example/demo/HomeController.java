package com.example.demo;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Entity
@Table(name="user")
class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	String password;
	String username;
	String firstName;
	String lastName;
	String email;
	
	@OneToMany(mappedBy = "user")
	private Set<Transaction> transactions = new HashSet<>();

	@OneToMany(mappedBy="user")
	private Set<Card> cards = new HashSet<>();

	@OneToMany(mappedBy="user")
	private Set<Account> accounts = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Set<Card> getCards() {
		return cards;
	}

	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}


@Entity
@Table(name="card")
class Card{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="card_id")
    int id;
    int number;
    int year;
    int code;
    int month;
    String image;
    
    public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	// user 
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
        
}

@Entity
@Table(name="product")
class Product{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
}

@Entity
@Table(name="seller")
class Seller{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="seller_id")
	private Long id;
	String name;
	
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy="seller")
	private Set<Product> products = new HashSet<>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
@Entity
@Table(name="transaction")
class Transaction{
    // user one to many 
    // seller 
    // price 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transaction_id")
	int id;
	
	
	double amount;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}


	int date;
	
	@ManyToOne
	@JoinColumn(name="user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="card")
	private Card card;
	
	@ManyToOne
	@JoinColumn(name="seller")
	private Seller seller;
	
}


@Entity
@Table(name="account")
class Account
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="account_id")
    int id;

	double balance;
	
	String type;

	@ManyToOne
	@JoinColumn(name="id")
	private User user;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}


// TODO:

@Controller 
public class HomeController {
	
	@Autowired
	UserRepository userRep;
	
	// repositories 
	// for transactions 
	// and all the others 
	
	
	@RequestMapping("/register")
	public String register(Model model){
		model.addAttribute("User", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute User user,Model model) {
		
		System.out.print("name" + user.getEmail());
		System.out.println("adding to the db");
	    model.addAttribute("user", user);
		userRep.save(user);
	    return "index";
	}
	@RequestMapping("/login")
	public String login(Model model){
		model.addAttribute("User", new User());
		return "login";
	}
	
	@PostMapping("/addcard")
	public String addcard(@ModelAttribute User user,Model model) {
		
		System.out.print("name" + user.getEmail());
		System.out.println("adding to the db");
	    model.addAttribute("user", user);
		userRep.save(user);
	    return "index";
	}
	
	
	@GetMapping("/addall")
	public String addAll(@ModelAttribute User user,Model model)
	{
		// add some user 
		// add some transaction 
		// add some seller 
		// add some product 
		// add some card 
		// transaction -> seller -> product -> card 
		
	}
//	@RequestMapping("/logout")
//	public String logout(Model model) {
////		model.addAttribute()
//		return "index";
//	}
//	@RequestMapping("/dashboard")
//	public String logout(Model model) {
////		model.addAttribute()
//		// query the tran
//		
//		
//		return "dashboard";
//	}

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
	
	@RequestMapping("/dashboard")
	public String logout(Model model) {
//		model.addAttribute()
		// query the tran
		
		
		return "dashboard";
	}

}
