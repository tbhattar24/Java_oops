public class Bank {

	public static void main(String[] args) {
   SavingAccount savingaccount = new SavingAccount(10000,600);
   CurrentAccount currentaccount = new CurrentAccount(1000,300);
   savingaccount.totalAmt();
   currentaccount.totalAmt();
   double totalbankbal= savingaccount.totalAmt()+currentaccount.totalAmt();
   System.out.println("total cash in the bank:"+totalbankbal);
   }

}

public class SavingAccount extends Bank{
	    private double fixedDeposit;
	    private double balance;
	    

	    public SavingAccount(double fixedDeposit, double balance)
	    {
	    	this.fixedDeposit=fixedDeposit;
	    	this.balance=balance;
	    }
	    public double totalAmt() {
	    	double Savingsbal= fixedDeposit+balance;
	    	return Savingsbal;
	   }
}
public class CurrentAccount extends Bank {
	private double cashcredit;
	private double balance;
	
 public CurrentAccount(double cashcredit, double balance)
 {
	 this.balance=balance;
	 this.cashcredit=cashcredit;
	 
 }
 public double totalAmt() {

     double currentbal= cashcredit+balance;
     return currentbal;
      }
	}
