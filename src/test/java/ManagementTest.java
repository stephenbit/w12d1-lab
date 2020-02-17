import org.junit.Before;
import org.junit.Test;
import staff.management.Management;

import static org.junit.Assert.assertEquals;

public class ManagementTest {

    Management manager;
    Double raise;

    @Before
    public void before() {
        manager = new Management(
                "George",
                "HART97",
                100000000,
                "Cheese"
        );
        raise = new Double(1);
    }

    @Test
    public void testGetName() {
        assertEquals("George", manager.getName());
    }

    @Test
    public void testGetNiNumber() {
        assertEquals("HART97", manager.getNiNumber());
    }

    @Test
    public void testGetSalary() {
        assertEquals(100000000, manager.getSalary());
    }

    @Test
    public void testGetDeptName() {
        assertEquals("Cheese", manager.getDeptName());
    }

    @Test
        public void testPayBonus() {
        assertEquals(
                101000000,
                manager.payBonus(manager.getSalary())
        );
    }

    @Test
    public void testRaiseSalary() {
        assertEquals(100000001.00, manager.raiseSalary(raise));
    }

}
