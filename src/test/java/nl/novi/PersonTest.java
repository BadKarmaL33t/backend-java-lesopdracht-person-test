package nl.novi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testSetName() {
        //arrange:
        Person person = new Person();
        String expectedName = "John";

        //act:
        person.setName(expectedName);
        String actualName = person.getName();

        //assert:
        assertEquals(expectedName, actualName);
    }
}
