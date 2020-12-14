import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ContactListTest {
	private ContactList contactListTest = new ContactList();
	@Before
	public void setUp() throws Exception {
		contactListTest = new ContactList();
		contactListTest.insert("sally", "123-456-7890");
		contactListTest.insert("sharol", "123-456-7891");
		contactListTest.insert("diane", "530-456-1592");
		contactListTest.insert("conny", "028-263-0011");

	}
	@Test
	public void testFindName () {
		Contact person = contactListTest.findName("sally");
		assertNotNull(person);
		assertEquals("sally", person.getName());
		assertNull(contactListTest.findName("fred"));
	}
	@Test
	public void testFindNumber () {
		Contact person = contactListTest.findNumber("123-456-7890");
		assertNotNull(person);
		assertEquals("sally", person.getName());
		assertEquals("123-456-7890", person.getNumber());
		assertNull(contactListTest.findNumber("123-111-1133"));
	}	
	
	@Test
	public void testDelete () {
		contactListTest.delete("sharol");		
		assertNull(contactListTest.findName("sharol"));
	}	

	@Test
	public void testInsert () {
		boolean insertPerson = contactListTest.insert("random", "000-999-2233");
		assertTrue(insertPerson);
		insertPerson = contactListTest.insert("sally", "123-456-7890");
		assertFalse(insertPerson);
	}	

	@Test
	public void testOthers () {
		assertEquals(contactListTest.size(), contactListTest.size());
		System.out.println("searchAllContacts:");
		contactListTest.searchAllContacts("sally");
		contactListTest.printAllContacts();

	}	

	// other tests to be included
}
