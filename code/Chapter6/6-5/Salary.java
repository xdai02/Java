public class Salary {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new FullTimeEmployee("Alice", 5783, 173),
                new PartTimeEmployee("Bob", 150, 15)
        };

        for (Employee employee : employees) {
            System.out.println(
                    employee.getName() + ": $" + employee.getSalary()
            );
        }
    }
}
