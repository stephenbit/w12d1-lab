package staff;

public abstract class Employee {

    public String name;
    public String nINumber;
    public double salary;

    public Employee(String name, String nINumber, double salary) {
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

    public double getSalary() {
        return salary;
    }

    public double payBonus(double salary) {
        return salary *= 1.01;
    }

    public abstract void raiseSalary(double salary);


}
