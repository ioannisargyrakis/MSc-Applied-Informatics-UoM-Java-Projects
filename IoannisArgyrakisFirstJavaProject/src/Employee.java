public class Employee {
	private String name;
    private String education;
    private int postGrad;
    private int years;
    private boolean married;
    private int numChildren;
    private int salary;
    private int bonus;
    private int monSalary;
    
    public Employee (String eponimo, String ekpaideush, int tritobathmia , int xronia, boolean eggamos, int paidia, int misthos){
      name = eponimo ;
      education = ekpaideush;
      postGrad = tritobathmia;
      years = xronia;
      married = eggamos;
      numChildren = paidia;
      salary = misthos;
      bonus = 0; //Αν και κανονικά οι μεταβλητές τύπου int αρχικοποιούνται στο 0
    }
    
    public String getName() {
    return name;
    }
    public String getEducation() {
    return education;
    }    
    public int getPostGrad() {
    return postGrad;    
    }
    public int getYears(){
    return years;    
    }
    public boolean getMarried() {
    return married;
    }
    public int getNumberOfChildren() {
    return numChildren;    
    }
    public int getSalary() {
    return salary;    
    }
    public int getBonus() {
    return bonus;    
    }
    
    public void setEducation (String newEducation) {
    	education = newEducation;
    }
    
    public void setPostGrad(int newPostGrad) {
    	postGrad = newPostGrad;
    }
    
    public void oneYear() {
    	years++;
    }
    
    public void setMarried (boolean newMarried) {
    	married = newMarried;
    }
    
    public void setNumChilder(int newChildren) {
    	if	(numChildren + newChildren >= 0) {
    		numChildren = numChildren + newChildren;
    	} 
    	else {
    		System.out.println("Λάθος! Δεν επιτρέπεται αρνητικός αριθμός παιδιών");
    	}
    }
    
    public void setBonus(int bonusLabor, int bonusChild) {
    	int marriageBonus;
    	int bonusGrad=0;
    	if	(married) {
    		marriageBonus = 50;
    	}
    	else {
    		marriageBonus = 0;
    	}
    	
    	if (postGrad==0) {
    		bonusGrad=0;
    	}
    	else if (postGrad==1) {
    		bonusGrad=50;
    	}
    	else if (postGrad==2) {
    		bonusGrad=100;
    	}
		bonus = bonusLabor*years+marriageBonus+numChildren*bonusChild+bonusGrad;
    }
    
    public int monthlySalary() {
    	monSalary = salary + bonus;
    	return monSalary;
    }
    
    public void getValues() {
    	System.out.println("==============================");
    	System.out.println("Όνοματεπώνυμο: "+name);
    	System.out.println("Βαθμίδα εκπαίδευσης: "+ education);
    	if (postGrad == 0) { 
    		System.out.println("Μεταπτυχιακές σπουδές: Δεν έχει");
    	} else if (postGrad == 1) {
    		System.out.println("Μεταπτυχιακές σπουδές: Μεταπτυχιακό δίπλωμα");
    	} else if (postGrad == 2) {
    		System.out.println("Μεταπτυχιακές σπουδές: ∆ιδακτορικό δίπλωμα");
    	}
    	System.out.println("Έτη υπηρεσίας: "+years);
    	if (married) {
    		System.out.println("Οικογενειακή κατάσταση: έγγαμος");
    	} else {
    	System.out.println("Οικογενειακή κατάσταση: άγαμος");
    	}
    	System.out.println("Αριθμός ανήλικων παιδιών: "+numChildren);
    	System.out.println("Μισθός: "+salary+" euros");
    	System.out.println("Μηνιαία εισόδημα: "+monSalary+" euros");
    	System.out.println("==============================");
    }
}



