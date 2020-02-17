package staff.management;

import staff.Employee;

public class Management extends Employee {

    private String deptName;

    public Management(String name, String nINumber, double salary, String deptName) {
        super(name, nINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void raiseSalary(double increase) {
        this.salary += increase ;
    }


}
