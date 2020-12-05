import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import final_project.Contact;
import static org.junit.Assert.assertEquals;

public class ContactTest {

	@Test
	public void testGetters () {
		Contact person1 = new Contact("harold", "209-555-9988");
		assertEquals("harold", person1.getName());
		assertEquals("209-555-9988", person1.getNumber());
		
	}
	
	@Test
	public void testSetters () {
		Contact person1 = new Contact("harold", "209-555-9988");
		person1.setName("mary");
		assertEquals("mary", person1.getName());
		person1.setNumber("209-555-9989");
		assertEquals("209-555-9989", person1.getNumber());
		
	}

	@Test
	public void testString () {
		Contact person1 = new Contact("harold", "209-555-9988");
		assertEquals("harold, 209-555-9988", person1.toString());
	}
}