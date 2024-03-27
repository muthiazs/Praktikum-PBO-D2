public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create objects of FullTimeEmployee and PartTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "John Doe", 4000.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(201, "Jane Smith", 15.0, 30);

        // Print Full-Time Employee details
        System.out.println("Full-Time Employee Details:");
        System.out.println("ID: " + fullTimeEmployee.id);
        System.out.println("Name: " + fullTimeEmployee.name);
        System.out.println("Monthly Salary: $" + fullTimeEmployee.calculateSalary());
        System.out.println("Full-Time Employee Schedule: ");
        fullTimeEmployee.displaySchedule();
        System.out.println();

        // Print Part-Time Employee details
        System.out.println("Part-Time Employee Details:");
        System.out.println("ID: " + partTimeEmployee.id);
        System.out.println("Name: " + partTimeEmployee.name);
        System.out.println("Hourly Rate: $" + partTimeEmployee.hourlyRate);
        System.out.println("Hours Worked: " + partTimeEmployee.hoursWorked);
        System.out.println("Salary: $" + partTimeEmployee.calculateSalary());
        System.out.println("Part-Time Employee Schedule: ");
        partTimeEmployee.displaySchedule();
    }
}