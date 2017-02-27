
public class Account {
	protected String FirstName, LastName;
	protected double CurBalance;
	
	public Account (String fname, String lname, double curbalance){
		FirstName = fname;
		LastName = lname;
		CurBalance = curbalance;
	}
	
	public String getAcctType(){
		return this.getClass().getName();
	}
	
	public double DebitTransaction(double debitAmount){
			CurBalance -= debitAmount;
		return debitAmount;
	}
	
	public double CreditTransaction(double creditAmount){
			CurBalance += creditAmount;
		return creditAmount;
	}
	
	public String toString(){
		return "Account name: " + FirstName + " " + LastName + ", Account Type: " + getAcctType() + ", Balance: " + String.format("$%.2f", CurBalance);
	}
	
    public static void main(String[] args)
    {
        Account ac1 = new Account("John", "Smith", 100);
        System.out.println(ac1);

        ac1.DebitTransaction(30.25); 
        System.out.println(ac1);

        ac1.CreditTransaction(10.10);
        System.out.println(ac1); 
    }

  /* Output of the unit test
  Account name: John Smith, Account Type: Account, Balance: $100.00
  Account name: John Smith, Account Type: Account, Balance: $69.75
  Account name: John Smith, Account Type: Account, Balance: $79.85
  */
} 

