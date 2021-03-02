package college;
public class Member {
	private String id;
	private String  firstName;
	private String lastName;
	private  String  address;
	private  String  zip;
	private String   city;
	private String  state;
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirsName(String firsName) {
		this.firstName = firsName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getZip() {
		return zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}




	
	public String toCSVString(Member member)
	{
		return member.getId()+","+member.getFirstName()+","+member.getLastName()+","+member.getAddress()+","+member.getCity()+
				","+member.getZip()+"\n";
	}
	

}

