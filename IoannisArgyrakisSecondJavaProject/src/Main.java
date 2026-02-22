
public class Main {

	public static void main(String[] args) {
		Loaner prwtos = new Loaner("Papadopoulos Periklhs",
				"Egnatia 40","Thessaloniki",44656,"2310897678",
				"Kassandrou 150","Thessaloniki",54634,"2310234567",5000); 
		
		Loaner giannis = new Loaner("Argyrakis Giannis",
				"Tompazi 22","Thessaloniki",55535,"2310430858",
				"Omirou 7","Thessaloniki",54639,"2310832926",4000);
		
		prwtos.sendReminder();//1o reminder
		prwtos.sendReminder();//2o reminder
		prwtos.sendReminder();//3o reminder
		prwtos.sendReminder();//4o reminder
		
		giannis.payment(4000); //payment full amount
		giannis.sendReminder(); //Empty reminder
		
		prwtos.payment(2000); //Payment 2000
		prwtos.sendReminder();//Last reminder
		prwtos.payment(3000);//Last payment
	}

}
