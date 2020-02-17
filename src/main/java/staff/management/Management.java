package staff.management;

import staff.Employee;

public class Management extends Employee {

    private String deptName;

    public Management(String name, String nINumber, int salary, String deptName) {
        super(name, nINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }


}
