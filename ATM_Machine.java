package taks3;

import java.util.Scanner;
class Bank_Account{
	
	private double amount;
	
	
	public Bank_Account(double balance) {
		this .amount =balance;
	}
	
	
	public double getBalance() {
		return amount;
	}
	
	
	public void deposite(double deposite_amount) {
		if(deposite_amount>0) {
		 amount += deposite_amount;
		System.out.println("Amount Deposited Successfully ! Current balance :"+ amount);
		}
		else {
			System.out.println("Invalid Amount Deposited ! ");
		}
	}
	
	
	public void withdrawal(double withdrawal_amount) {
		
		if(withdrawal_amount>0 && withdrawal_amount<=amount) {
		amount-=withdrawal_amount;
		
		System.out.println("Amount Withdrawal Successfully ! current balance : "+ amount);
		}
		else {
			System.out.println("Insufficent Balance ! ");
		}	
	}	
}


public class ATM_Machine {
	
	private Bank_Account account ;
	
	public ATM_Machine(Bank_Account account) {
		this.account=account;
	}
	
	public void checkBalance() {
		System.out.println("Current balance :"+ account.getBalance());
	}
	
	public void deposite(double amount) {
		account.deposite(amount);
	}
	
	public void withdrawal(double amount) {
		account.withdrawal(amount);
	}
	
	public void display() {
	Scanner sc=new Scanner(System.in);
	int choice;
	
	do {
		 System.out.println(" \nATM Menu:");
         System.out.println("1. Check Balance");
         System.out.println("2. Deposit Money");
         System.out.println("3. Withdraw Money");
         System.out.println("4. Exit");
         System.out.print("Choose an option: ");
         choice=sc.nextInt();
         
         switch(choice) 
         {
         case 1:
        	 checkBalance();
        	 break;
        	 
         case 2:
        	 System.out.println("Enter deposite amount :");
        	 double depositeAmount=sc.nextDouble();
        	 deposite(depositeAmount);
        	 break;
        	 
         case 3:
        	 System.out.println("Enter withdrawal amount :");
        	 double withdrawalAmount =sc.nextDouble();
        	 withdrawal(withdrawalAmount);
        	 break;
        	 
         case 4:
             System.out.println("Thank you for using the ATM. Goodbye!");
             break;
        
         default:
             System.out.println("Invalid option. Please try again.");
             break;
        }
         
     } while (choice != 4);

      sc.close();
         
}
	public static void main(String[] args) {
		Bank_Account BankAccount=new Bank_Account(10000.0);
		
		ATM_Machine Atm=new ATM_Machine(BankAccount);
		
		Atm.display();

	}

}
