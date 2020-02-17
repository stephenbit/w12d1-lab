import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director(
                "Jimmery",
                "NKLN434",
                100000.0,
                "Executive",
                1000.0
        );
    }

    @Test
    public void testGetName() {
        assertEquals("Jimmery", director.getName());
    }

    @Test
    public void testGetNiNumber() {
        assertEquals("NKLN434", director.getNiNumber());
    }

    @Test
    public void testGetSalary() {
        assertEquals(100000.0, director.getSalary(), 0.01);
    }

    @Test
    public void testGetDeptName() {
        assertEquals("Executive", director.getDeptName());
    }

    @Test
    public void testPayBonus() {
        assertEquals(101000.0, director.payBonus(director.getSalary()), 0.01);
    }

    @Test
    public void testRaiseSalary() {
        director.raiseSalary(1.00);
        assertEquals(100001.0, director.getSalary(), 0.01);
    }

    @Test
    public void getBudget() {
        assertEquals(1000.0, director.getBudget(), 0.01);
    }

}
