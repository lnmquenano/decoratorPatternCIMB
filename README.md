# decoratorPatternCIMB
<h3>Software Engineering 1 | Lab Assignment 7</h3>
<h3>Problem Statement:</h3>

CIMB is a digital bank that offers GSave and UpSave savings accounts.   As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%.
The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%.
Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%.
Benefits include the "Standard Savings Account" plus "with Insurance".

Develop a decorator pattern approach that will implement the given UML diagram.

-----------------------------------------------------------------------------------------------------------------------------

The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name :

public class Cimb {

	public static void main(String[] args) {
		
		SavingsAccount account = new SavingsAccount();
		
		account.setAccountNumber(1234);
		account.setAccountName("Juan Dela Cruz");
		account.setBalance(10000.0);
		
		System.out.println(account.showInfo());
		System.out.println("Account type: " + account.showAccountType());
		System.out.println("Interest rate: " + account.getInterestRate());
		System.out.println("New balance: " + account.computeBalanceWithInterest());
		System.out.println("Benefits: " + account.showBenefits());
		
		System.out.println("----------------------");
		
		GSave gSave = new GSave(account);
		System.out.println(gSave.showInfo());
		System.out.println("Account type: " + gSave.showAccountType());
		System.out.println("Interest rate: " + gSave.getInterestRate());
		System.out.println("New balance: " + gSave.computeBalanceWithInterest());
		System.out.println("Benefits: " + gSave.showBenefits());
		
		System.out.println("----------------------");
		
		UpSave upSave = new UpSave(account);
		System.out.println(upSave.showInfo());
		System.out.println("Account type: " + upSave.showAccountType());
		System.out.println("Interest rate: " + upSave.getInterestRate());
		System.out.println("New balance: " + upSave.computeBalanceWithInterest());
		System.out.println("Benefits: " + upSave.showBenefits());
	}
}

-----------------------------------------------------------------------------------------------------------------------------

You should display the following output:<br>
<img width="512" height="473" alt="labass7output" src="https://github.com/user-attachments/assets/27295f8d-6c25-406c-bf29-0ffe3d416d27" />

Description of the following methods:
<ul>
<li>showAccountType() - Either returns "Savings Account", "GSave" or "UpSave"</li>
<li>getInterestRate() - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% UpSave</li>
<li>getBalance() - Returns the balance of the account set.</li>
<li>showBenefits() - Either returns "Standard Savings Account" for Savings Account; benefits offered by savings account + "GSave Transfer"; benefits offered by savings account + "With Insurance";</li>
<li>computeBalanceWithInterest() - returns new balance by computing the balance plus the interest depending on the interest rate.</li>
<li>showInfo() - Returns details of account number, account name, and balance.</li>
</ul>

BankAccountDecorator must be an interface.

Follow instructions.  You are not allowed to insert other methods except what is stated in the diagram (setters and getters are allowed).

<h3>UML Class Diagram:</h3>
<img width="512" height="337" alt="labass7uml" src="https://github.com/user-attachments/assets/3d2c7b31-7e30-46a7-9901-b593526ca70e" />
