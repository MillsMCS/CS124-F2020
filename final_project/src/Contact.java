import java.util.HashMap;

public class Contact {
	String myName;
	String myNumber;
	HashMap<String, String> contact = new HashMap<>();
	
	public Contact(String name, String number) {
		myName = name;
		myNumber = number;
	}// 2 parameter constructor
	
	public Contact() {
		this(null, null);
	}// 0 parameter constuctor
	
	public String getName() {
		return myName;
	}//getName
	
	public void setName(String name) {
		myName = name;
	}//setName
	
	public String getNumber() {
		return myNumber;
	}//getNumber
	
	public void setNumber(String number) {
		myNumber = number;
	}//setNumber
	
	public String toString() {
		return myNumber;
	}
}//Contact