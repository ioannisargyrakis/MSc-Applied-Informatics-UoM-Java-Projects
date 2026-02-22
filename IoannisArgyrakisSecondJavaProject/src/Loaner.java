
public class Loaner {
	private String name;
	private Contact homeAddress;
	private Contact workAddress;
	private int amountDue;
	private int reminder;

	public Loaner (String aName,
			String haddress, String htown, int hzipCode, String hphoneNumber,
			String waddress, String wtown,int wzipCode, String wphoneNumber,
			int amount) {
		
		name = aName;
		homeAddress	= new Contact(haddress,htown,hzipCode,hphoneNumber); 
		workAddress = new Contact(waddress,wtown,wzipCode,wphoneNumber);
		reminder=1; //Αρχικοποίησα στο 1 για να γίνεται σωστό print των αριθμών των reminders 
		amountDue = amount;
	}
	
/*8b	public LoanerSecond(String theName, Contact thehomeAddress, Contact theWorkAddress, int theAmountDue) {
		name = theName;
	    homeAddress = thehomeAddress;
	    workAddress = theWorkAddress;
	    amountDue = theAmountDue;
	    reminder = 0;
	} */
	
	public void reduceAmount(int reduction) {
		amountDue -= reduction;
	}
	
	public void incrementReminder() {
		if	(amountDue!=0) {
			reminder++;
		}
	}
	
	public void receipt(int amount) {
		System.out.println("********** Receipt ******************");
		System.out.println("O/H "+name+" paid "+amount); 
		System.out.println(homeAddress.getFullAddress());
		System.out.println("The rest is "+ amountDue +" Euro");
		System.out.println("*************************************\n");
	}
	
	public void payment(int amount) {
		reduceAmount(amount);
		receipt(amount);
	}
	
	public void message(Contact address) {
		System.out.println("********** Remind "+reminder+" **********");
		System.out.println(name);
		System.out.println(address.getFullAddress()); 
		System.out.println("Please pay "+amountDue+" Euro by the end of the month");
		System.out.println("*************************************\n");
	}
	
	public void recordedMessage(Contact address) {
		System.out.println("********** Recorded message **********");
		System.out.println("********** Remind " + reminder +" **********");
		System.out.println("I am calling " +address.getPhoneNumber());
		System.out.println("Please pay "+amountDue+" Euro by the end of the month\n");
	}
	
	public void sendReminder() {
		if (amountDue!=0 && reminder==0) {
			message(workAddress);
			incrementReminder();
		} else if (amountDue!=0 && reminder==1) {
			message(homeAddress);
			incrementReminder();
		} else if (amountDue!=0 && reminder==2) {
			recordedMessage(workAddress);
			incrementReminder();
		} else if (amountDue!=0 && reminder==3) {
			recordedMessage(homeAddress);
			incrementReminder();
		} else if (amountDue==0) {
			return;
		} else {
			System.out.println("********** Last warning!!! ********** \n The remaining amount of your loan will be subtracted from your salary. \n*************************************\n");
		}
	}
}
