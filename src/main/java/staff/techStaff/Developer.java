package staff.techStaff;

import staff.Employee;

public class Developer extends Employee {

    public Developer(String name, String nINumber, double salary) {
        super(name, nINumber, salary);
    }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }

}
