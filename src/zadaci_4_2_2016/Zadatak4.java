package zadaci_4_2_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		
		//Novi akaunt
		Account account = new Account(1122, 20000);
		//Fiksna kamatna stopa
		account.setAnnualInterestRate(4.5);

		//ID i stanje na racunu
		System.out.println("Account ID: " + account.getId());
		System.out.println("Stanje racuna: " + account.getBalance());

		//Podizanje
		System.out.println("Podizanje $2,500");
		account.withdraw(2500);

		//Uplacivanje
		System.out.println("Uplata $3,000");
		account.deposit(3000);

		//Stampanje informacija
		System.out.println("Novi info");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Stanje: " + account.getBalance());
		System.out.println("Mjesecna kamatna stopa: "
				+ account.getMonthlyInterestRate());
		System.out.println("Datum kreiranja: "
				+ account.getDateCreated());

	}
}
