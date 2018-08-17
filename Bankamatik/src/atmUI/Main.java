package atmUI;

/*Database bilmediðim için verilerin elle girilmesi girilmesi gerekmektedir.
 * Normal hesaplarýn günlük limitleri 1500$'dýr.
 * Premium hesaplarýn günlük limitler 5000$'dýr.
 * Normal hesap constructor'ý þu þekildedir : "Id , Parola, bakiye".
 * Premium hesap constructor'ý þu þekildedir : "Id , Parola, bakiye, eMail, kredi limiti" 
 * */
public class Main {
	
	public static void main(String[] args) {
		Account Halil = new Account("1","1907",1600);
		Account Murtaza = new Account("2","1910",480);
		PremiumAcc Þerafettin = new PremiumAcc("1","1990",6000,"g@g.com",1000);
		Halil.withdraw(1501);
		Murtaza.withdraw(100);
		Þerafettin.withdraw(4000);
		
		
	}

}
