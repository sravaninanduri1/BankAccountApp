package BankAccontApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccApplication {

	public static void main(String[] args) {
		
		List<Account> account=new LinkedList<Account>();
		String file="C:\\Users\\srava\\Downloads\\NewBankAccounts.csv";
		//read csv file then create accounts based on data
		/*Checking c=new Checking("sravani","1253867832",2500);
		Savings s=new Savings("pavan","546789",1500);
		c.showInfo();
		s.showInfo();
		
		s.compound();
		s.deposit(5000);
		s.withdraw(200);
		s.transfer("Brokerage", 3000);*/
		List<String[]> newAccountHolder=utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolder) {
			//System.out.println("NEW ACCOUNT");
			String name=accountHolder[0];
			String ssn=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			System.out.println(name+" "+ssn+" "+accountType+" $"+initDeposit);
			if(accountType.equals("Savings")) {
				account.add(new Savings(name,ssn,initDeposit));
			}
			else if(accountType.equals("Checkings")){
				account.add(new Checking(name,ssn,initDeposit));
			}
			else {
				System.out.println("ERROR reaidng account type");
			}
		}
		for(Account acc:account) {
			System.out.println("\n**********");
			acc.showInfo();
		}
	}

}
