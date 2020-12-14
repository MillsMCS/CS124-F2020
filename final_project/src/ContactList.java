import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ContactList {
	Map<String, Contact> theList = new HashMap<>(); 
	Map<String, Contact> theNums = new HashMap<>(); 
	private int size;
	
	//constructor
	public ContactList() {
		//contact = new HashMap<String, String>();
		size = 0;
		theList = new HashMap<String, Contact>();
		theNums = new HashMap<String, Contact>();
	}
	
	/*
	 * Running time: O(1)
	 * Analysis: returns true once the new person is inserted into theList
	 */
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
		theNums.put(number, info);
		return true;
	}//insert

	/*
	 * Running time: O(1)
	 * Analysis: returns the name of the person searched if found, if not found, return null;
	 */
	public Contact findName(String name) {
		if(theList.containsKey(name)) {
			//System.out.print("Found: " + name + "\n");
			return theList.get(name);
		}//if
		//System.out.print("No name found\n");
		return null;
	}//findName
	
	/*
	 * Running time: O(1)
	 * Analysis: returns the number of the person searched if found, if not found, return null;
	 */
	public Contact findNumber(String number) {
		if(theNums.containsKey(number)) {
			return theNums.get(number);
		}//if
		return null;
	}//find

	/*
	 * Running time: O(1)
	 * Analysis: deletes the person with the nameOrNumber passed through;
	 */
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
	
	/*
	 * Running time: O(1)
	 * Analysis: returns the size of the theList;
	 */
	public int size() {
		return theList.size();
	}//size
	
	/*
	 * Running time: O(n log n)
	 * Analysis: returns the names of everyone in the list, sorted by name;
	 */
	public void printAllContacts() {
		TreeMap<String, Contact> temp = new TreeMap<>(theList);
		System.out.println("unsorted:" + theList);

		System.out.println("sorted: ");

		for(Map.Entry<String, Contact> entry : temp.entrySet()) {
			System.out.println( entry.getKey() + " " + entry.getValue());
		}
	}//printALLContacts
	
	/*
	 * Running time: O(n log n)
	 * Analysis: returns the name and number of the person passed through in the parameter;
	 */
	public void searchAllContacts(String target) {
		//is target string in the key
		for(Map.Entry<String, Contact> entry : theList.entrySet()) {
			if(entry.getKey().contains(target)){
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}//for
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
						
			System.out.print("testing insert & printAllContacts: \n");
			person.insert("sophee mae", "123-000-8888");
			person.insert("sophee smith", "209-209-8388");

			person.insert("kelly", "123-111-2234");
			person.insert("ally", "333-200-2957");
			person.insert("bob", "444-161-3574");
			person.printAllContacts();


			System.out.print("\ntesting searchAllContacts: \n");
			person.searchAllContacts("ob");
		}
	}
}//HashMap


















