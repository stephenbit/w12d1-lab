import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin(
                "Joe",
                "XNQL562",
                1234.00
        );
    }

    @Test
    public void getName() {
        assertEquals("Joe", databaseAdmin.name);
    }

    @Test
    public void testGetNiNumber() {
        assertEquals("XNQL562", databaseAdmin.getNiNumber());
    }

    @Test
    public void testGetSalary() {
        assertEquals(1234.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void testPayBonus() {
        assertEquals(1246.34, databaseAdmin.payBonus(databaseAdmin.getSalary()), 0.01);
    }

    @Test
    public void testRaiseSalary() {
        databaseAdmin.raiseSalary(1.00);
        assertEquals(1235.0, databaseAdmin.getSalary(), 0.01);
    }
}
