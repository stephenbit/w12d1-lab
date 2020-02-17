import org.junit.Before;
import org.junit.Test;
import staff.management.Management;

import static org.junit.Assert.assertEquals;

public class ManagementTest {

    Management manager;

    @Before
    public void before() {
        manager = new Management(
                "George",
                "HART97",
                100000000.00,
                "Cheese"
        );
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
        assertEquals(100000000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void testGetDeptName() {
        assertEquals("Cheese", manager.getDeptName());
    }

    @Test
        public void testPayBonus() {
        assertEquals(101000000.00, manager.payBonus(manager.getSalary()), 0.01);
    }

    @Test
    public void testRaiseSalary() {
        manager.raiseSalary(1.00);
        assertEquals(100000001.00, manager.getSalary(), 0.01);
    }

}
