package atmUI;

/*Database bilmedi�im i�in verilerin elle girilmesi girilmesi gerekmektedir.
 * Normal hesaplar�n g�nl�k limitleri 1500$'d�r.
 * Premium hesaplar�n g�nl�k limitler 5000$'d�r.
 * Normal hesap constructor'� �u �ekildedir : "Id , Parola, bakiye".
 * Premium hesap constructor'� �u �ekildedir : "Id , Parola, bakiye, eMail, kredi limiti" 
 * */
public class Main {
	
	public static void main(String[] args) {
		Account Halil = new Account("1","1907",1600);
		Account Murtaza = new Account("2","1910",480);
		PremiumAcc �erafettin = new PremiumAcc("1","1990",6000,"g@g.com",1000);
		Halil.withdraw(1501);
		Murtaza.withdraw(100);
		�erafettin.withdraw(4000);
		
		
	}

}
