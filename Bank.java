package _0entities;

public class Bank {

	private String name;
	private int accountNumber;
	private double balance;

	public Bank() {

	}

	public Bank(int accountNumber, String name, double initialDeposit) {//construtor cem opção de deposito inicial

		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public Bank(int accountNumber, String name) {//construtor sem opção de deposito inicial

		this.accountNumber = accountNumber;
		this.name = name;
	}

	public void withdraw(double withdraw) { //metodo para realizar saques

		balance -= withdraw + 5.00;
	}

	public double deposit(double initialDeposit) {// metodo para o deposito inicial

		return balance += initialDeposit;

	}

	public String getName() {

		return name;
	}

	public void setName(String newName) {

		name = newName;

	}

	public int getAccountNumber() {

		return accountNumber;
	}

	public double getBalance() {

		return balance;
	}
	
	public String toString() {
		
		return  
				"Account: nº "
				+ String.format("%d, ", getAccountNumber())
				+"Holder: Mr(s) "
				+String.format("%s, ", getName())
				+" Balance: $"
				+String.format("%.2f.", getBalance());
	}

}
