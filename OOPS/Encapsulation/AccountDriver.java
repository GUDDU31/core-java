class AccountDriver
{
	public static void main(String[] args)
	{
		Account ac1=new Account ("sheela", 123456, 10500);
		ac1.getAccountDetails();
		System.out.println(ac1.getBalance());
		ac1.setName("laila");
		ac1.getAccountDetails();
		ac1.setBalance(1500);
		ac1.getAccountDetails();
	}
	
    
}