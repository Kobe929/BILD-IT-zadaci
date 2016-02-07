package zadaci_4_2_2016;

import java.util.Date;


public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private  Date DateCreated = new java.util.Date();
	
	//No-args konstruktor
	public Account() {
		DateCreated = new Date();
	}
	
	//Konstruktor
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		
	}
	
	//Vraca id racuna
	public int getId() {
		return id;
	}
	
	//Postavlja id racuna
	public void setId(int id) {
		this.id = id;
	}
	
	//Vraca stanje na racunu
	public double getBalance() {
		return balance;
	}
	
	//Postavlja stanje racuna
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//Vraca datum kad je racun kreiran
	public java.util.Date getDateCreated() {
		return DateCreated;
	}
	
	//Vraca mjesecnu stopu
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12f;
	}
	
	//Podizr lovu
	public void withdraw(double iznos){
		if(iznos < this.balance){
			this.balance -= iznos;
		}
	}
	
	//Uplacuje
	public void deposit(double iznos){
		this.balance += iznos;	
	}
	public void setAnnualInterestRate(double d) {
		
		annualInterestRate = d;
		
	}
	
}