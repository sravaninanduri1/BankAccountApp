package BankAccontApp;

public class Savings extends Account {
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
   
   public Savings(String name,String ssn,double initDeposit) {
	   super(name,ssn,initDeposit);
	   accountNumber="1"+accountNumber;
	   setSafetyDepositBox();
   }
   @Override
   public void setRate() {
	   rate=getRate()-.25;
   	
   }
   public void setSafetyDepositBox() {
	   safetyDepositBoxId=(int)(Math.random()*Math.pow(10, 3));
	   safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
   }
   public void showInfo() {
	   super.showInfo();
	   System.out.println("Your savings account features:"+
	                      "\nSafety Deposit Box Id: " +safetyDepositBoxId+
	                      "\nSafety Deposit Box Key: " +safetyDepositBoxKey
			   );
   }
}
