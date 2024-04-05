package org.bank;

public class BankInfo {
	private void fullName() {
		System.out.println("Name: KASTHURI");

	}
	private void sortCode() {
		System.out.println("Sort number: 453678");

	}
	private void accountNumber() {
		System.out.println("Account number: 56477826454986");

	}private void bankAddress() {
		System.out.println("Bank Address: Neru mainroad in chennai");

	}
	static public void main(String[] args) {
		BankInfo bi = new BankInfo();
		bi.fullName();
		bi.sortCode();
		bi.accountNumber();
		bi.bankAddress();
	}

}
