package staff.techStaff;

import staff.Employee;

public class DatabaseAdmin extends Employee {

    public DatabaseAdmin(String name, String nINumber, double salary) {
        super(name, nINumber, salary);
    }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }

}
