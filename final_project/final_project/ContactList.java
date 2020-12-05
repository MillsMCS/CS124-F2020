package final_project;
import java.util.Collections;
import java.util.HashMap;

public class ContactList {
	HashMap<String, Contact> theList = new HashMap<>(); 
	HashMap<String, Contact> theNums = new HashMap<>(); 
	private int size;
	
	//constructor
	public ContactList() {
		//contact = new HashMap<String, String>();
		size = 0;
		theList = new HashMap<String, Contact>();
		theNums = new HashMap<String, Contact>();
	}
	
	//returns number of elements in the Contact List
	public boolean insert(String name, String number) {
		if((theList.containsKey(name) || theList.containsKey(number)) 
				|| (theNums.containsKey(number) || theNums.containsKey(number))) {
			System.out.print("Duplicate detected.\n");
			return false;
		}
		if(name == null && number == null) {
			System.out.print("No name or number given.");
			return false;
		}
		Contact info = new Contact(name, number);
		theList.put(name, info);
		theNums.put(name, info);
		return true;
	}//insert
	
	public Contact findName(String name) {
		if(theList.containsKey(name)) {
			//System.out.print("Found: " + name + "\n");
			return theList.get(name);
		}//if
		//System.out.print("No name found\n");
		return null;
	}//findName
	
	public Contact findNumber(String number) {
		if(theNums.containsKey(number)) {
			//System.out.print("Found: " + number + "\n");
			return theNums.get(number);
		}//if
		return null;
	}//find

	
	public void delete(String nameORnumber) {
		if(theList.containsKey(nameORnumber)) {
			theList.remove(nameORnumber);
			//System.out.print(nameORnumber + " has been removed\n");
			
		}  else if (theNums.containsKey(nameORnumber)) {
			theNums.containsKey(nameORnumber);
		} else {
			System.out.print(nameORnumber + " is not in the hashmap\n");
		}//else
	}//delete
	
	public int size() {
		return theList.size();
	}//size
	
	@Override
	public String toString() {
		return "\nContactList: \n" + theList ;
	}//toString

	
	public void printAllContacts() {
		System.out.print(theList);
	}//printALLContacts
	
	public void searchAllContacts(String target) {
		if(theList.containsKey(target) || theNums.containsKey(target)) {
			Map<String, String> map = new TreeMap<>(theList)
			return 
		}
	}//searchALLContacts
	
	// https://www.baeldung.com/java-check-string-number
	private static boolean isNumeric(String strNum) {
		try {
			long l = Long.parseLong(strNum);
		} catch (NumberFormatException | NullPointerException nfe) {
			return false;
		}
		return true;
	}
	
	public static class Main {
		public static void main(String[] args) {
			ContactList person = new ContactList();
//			HashMap<String, String> person = new HashMap<>();
//			person.put("kelly", "123");
//			int num = "kelly".hashCode();
//			System.out.print(person);
//			System.out.print(num);
						
			System.out.print("testing insert: \n");
			person.insert("sophee", "123-000-8888");
			person.insert("kelly", "123-111-2234");
			person.insert("ally", "333-200-2957");
			person.insert("bob", "444-161-3574");

			person.findName("sophee");
			person.findNumber("123-456-7890");
			//person.delete("kelly");
			person.printAllContacts();
		}
	}
}//HashMap


















