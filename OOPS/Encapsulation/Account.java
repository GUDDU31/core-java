class Account
{
	private String acc_hol_name;
	private long acc_no;
	private double balance;
Account(String achname, long accno, double bal)
	{
		this.acc_hol_name= achname;
		this.acc_no= accno;
		this.balance=bal;
	}
public String getName()
    {
    	return acc_hol_name;
    }
public void setName(String newname)
    {
    	this.acc_hol_name=newname;
    }
public long getAccountNo()
    {
    	return acc_no;
    }
public double getBalance()
    {
    	return balance;
    }
public void setBalance(double newbal)
    {
    	this.balance= this.balance+newbal;
    }
public void getAccountDetails()
    {
    	System.out.println("Account Holder Name = " +acc_hol_name);
    	System.out.println("Account Number = " +acc_no);
    	System.out.println("Balance = "+balance);
    }
}