public class PartTimeEmployee extends Employee implements WorkSchedule {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void displaySchedule() {
        System.out.println("Part-Time Employee Schedule: Flexible hours");
    }
}