package BankAccontApp;

public class Checking extends Account {
	private int debitCardNumber;
	private int debitCardPIN;
   public Checking() {
	   System.out.println("checking account");
   }
   public Checking(String name,String ssn,double initDeposit) {
	   super(name,ssn,initDeposit);
	   accountNumber="2"+accountNumber;
	   setDebitCard();
   }
   @Override
   public void setRate() {
   	rate=getRate()*.15;
   	
   }
   private void setDebitCard() {
	   debitCardNumber=(int) (Math.random()*Math.pow(10, 12));
	   debitCardPIN=(int) (Math.random()*Math.pow(10, 4));
   }
   public void showInfo() {
	   super.showInfo();
	   System.out.println("Checkings account features "+
	                       "\nDebit Card Number: "+debitCardNumber+
	                       "\nDebit Card PIN: "+debitCardPIN);
	   
   }

}
