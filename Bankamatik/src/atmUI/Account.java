package atmUI;
//Hesap
public class Account {
	//Hesap ismi
	private String ID;
	//Parola
	private String Pass;
	//Bakiye
	private float Balance = 0;
	//Günlük limit
	private final float Limit = 1500;
	Account(String ID, String Pass, float Balance){
		this.ID = ID;
		this.Balance = Balance;
		this.Pass = Pass;
	}
	//getter and setters
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getPass() {
		return Pass;
	}
	public void setPass(String pass) {
		Pass = pass;
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	public float getLimit() {
		return this.Limit;
	}
	public void withdraw(float amount) {
		if(this.getBalance() >= amount && amount < this.getLimit()) {
			this.setBalance(this.getBalance()-amount);
			System.out.println("New Balance : "+this.getBalance());
		}
		else if(amount > this.getLimit()) System.out.println("Daily limititaion is 1500$");
		else System.out.println("Not Enough Balance");
	
	}
	public void deposit(float amount) {
		this.setBalance(this.getBalance()+amount);
	}
	public void changePass(String newPass) {
		this.setPass(newPass);
	}
	
}
