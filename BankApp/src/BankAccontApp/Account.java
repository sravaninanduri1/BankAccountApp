package BankAccontApp;

public abstract class Account implements IBaseRate {
   private String name;
   private String ssn;
   private double balance;
   protected String accountNumber;
   protected double rate;
   private static int index=10000;
   public Account() {
	   System.out.println("New Account");
   }
   public Account(String name,String ssn,double initDeposit) {
	   this.name=name;
	   this.ssn=ssn;
	   balance=initDeposit;
	   //set account number
	   index++;
	   accountNumber=setAccountNumber();
	   setRate();
   }
   public abstract void setRate();
   private String setAccountNumber() {
	   String lastTwoDigSsn=ssn.substring(ssn.length()-2, ssn.length());
	   int uniqueID=index;
	   int randomNumber= (int) (Math.random()*Math.pow(10,3));
	   return lastTwoDigSsn+uniqueID+randomNumber;
   }
   public void showInfo() {
	   System.out.println("Name: " +name+
			              "\nAccount Number: "+accountNumber+
			              "\nBalance: "+balance+
			              "\nRate: "+rate+"%"
			   );
   }
   
   public void compound() {
	   double accruedInterest=balance*(rate/100);
	   balance=balance+accruedInterest;
	   System.out.println("Accrued Interest $"+accruedInterest);
   }
   //list common methods
   public void deposit(double amount) {
	   balance=balance+amount;
	   System.out.println("Depositing $"+amount);
	   printBalance();
   }
   public void withdraw(double amount) {
	   balance=balance-amount;
	   System.out.println("withdrawing $"+amount);
	   printBalance();
   }
   public void transfer(String toWhere,double amount) {
	   balance=balance-amount;
	   System.out.println("Transfering $"+amount+"to "+toWhere);
	   printBalance();
   }
   public void printBalance() {
	   System.out.println("Your balance is now $"+balance);
   }
}
