
public class Contact {
	private String address;
	private String town;
	private int zipCode;
	private String phoneNumber;
	
	public Contact (String address,String town, int zipCode, String phoneNumber) {
	this.address=address;
	this.town=town;
	this.zipCode=zipCode;
	this.phoneNumber=phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setFullAddress(String address1, String town1, int zipCode1) {
		address = address1;
		town = town1;
		zipCode = zipCode1;
	}
	
	public String getFullAddress() {
		String errorMessage = "";
		if	(address == null) {
			 errorMessage = errorMessage + "Missing address.\n";
		} 
		if (town==null) {
			errorMessage = errorMessage + "Missing town.\n";
		}
		if (zipCode==0) {
			errorMessage = errorMessage + "Missing zipCode.\n";
		} if (address == null || town==null || zipCode==0) {
			System.out.println(errorMessage+"\n"+"Please update!");
		}
		return address+" "+town+" "+zipCode;
	}
}
