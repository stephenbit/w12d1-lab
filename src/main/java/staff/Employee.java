package staff;

public abstract class Employee {

    public String name;
    public String nINumber;
    public int salary;

    public Employee(String name, String nINumber, int salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return nINumber;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void raiseSalary(double salary);

    public int payBonus(int salary) {
        return salary *= 1.01;
    }

}
