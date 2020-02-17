import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer(
                "Jonington Gilbery Grey",
                "SNCKLNW4",
                100.00
        );
    }

    @Test
    public void getName() {
        assertEquals("Jonington Gilbery Grey", developer.name);
    }

    @Test
    public void testGetNiNumber() {
        assertEquals("SNCKLNW4", developer.getNiNumber());
    }

    @Test
    public void testGetSalary() {
        assertEquals(100.00, developer.getSalary(), 0.01);
    }

    @Test
    public void testPayBonus() {
        assertEquals(101.0, developer.payBonus(developer.getSalary()), 0.01);
    }

    @Test
    public void testRaiseSalary() {
        developer.raiseSalary(1.00);
        assertEquals(101.0, developer.getSalary(), 0.01);
    }
}
