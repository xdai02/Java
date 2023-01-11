public class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;

    public FullTimeEmployee(
            String name, double basicSalary, double bonus
    ) {
        super(name);
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return basicSalary + bonus;
    }
}
