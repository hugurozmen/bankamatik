package atmUI;

public class PremiumAcc extends Account {
	
	
	private String eMail ;
	private float CreditLimit = 0;
	private final float Limit = 5000;
	
	public PremiumAcc(String ID, String Pass, float Balance, String eMail, float creditLimit) {
		super(ID, Pass, Balance);
		this.eMail = eMail;
		this.CreditLimit = creditLimit;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public float getCreditLimit() {
		return CreditLimit;
	}
	
	public float getLimit() {
		return this.Limit;
	}
	public void setCreditLimit(float creditLimit) {
		CreditLimit = creditLimit;
	}
	public void giveCredit(float amount) {
		if(amount < this.CreditLimit) {
			this.setBalance(amount);
			System.out.println("New Balance : " + this.getBalance());
		}
		else System.out.println("Not enough credit limit. \n Current credit limit is "
								+this.getCreditLimit() );
	}
	public void changeEMail(String eMail) {
		this.seteMail(eMail);
	}
	public void withdraw(float amount) {
	super.withdraw(amount);
		if(amount > this.getLimit()) {
		System.out.print("(if it's a premium account the daily limititaion is 5000$)");
	}
	}
	
	
	

}
