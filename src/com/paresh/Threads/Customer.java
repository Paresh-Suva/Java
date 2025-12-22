package com.paresh.Threads;

class ATM {

	synchronized void checkBalance(String Name) {
		
		System.out.print(Name+" Checking Balance...");
		
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
		}
		
		System.out.println(" Done...");
	}

	synchronized public void withdraw(String Name, int Amount) {

		System.out.print(Name+" Withdraw "+Amount+" Rupees...");

		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
		}
		
		System.out.println(" Done...\n ");
	}

}

class Customer extends Thread {

	ATM Atm ;
	String Name;
	int Amount;
	
	public Customer(String Name, int Amount, ATM Atm) {
		
		this.Name = Name;
		this.Amount = Amount;
		this.Atm = Atm;
		
	}
	@Override
	public void run() {
		useATM();
	}

	public void useATM() {
		synchronized (Atm) {
		Atm.checkBalance(Name);
		Atm.withdraw(Name, Amount);
		}
	}

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		Customer customer1 = new Customer("Paresh",1000,atm);
		Customer customer2 = new Customer("Mark",900,atm);
		Customer customer3 = new Customer("James",800,atm);
		Customer customer4 = new Customer("Sunder",700,atm);
		Customer customer5 = new Customer("Gill",600,atm);
		
		customer1.start();
		customer2.start();
		customer3.start();
		customer4.start();
		customer5.start();

	}
}
