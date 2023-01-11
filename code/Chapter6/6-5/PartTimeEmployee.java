public class PartTimeEmployee extends Employee {
    private double dailyWage;
    private int workingDays;

    public PartTimeEmployee(
            String name, double dailyWage, int workingDays
    ) {
        super(name);
        this.dailyWage = dailyWage;
        this.workingDays = workingDays;
    }

    @Override
    public double getSalary() {
        return dailyWage * workingDays;
    }
}
