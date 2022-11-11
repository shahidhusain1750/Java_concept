public class PTEmployee extends Employee {
    private double dailyWages;
    private double totalDays;

    public PTEmployee() {
        super();
    }

    public PTEmployee(String name, int age, int empid) {
        super(name, age, empid, 0);
    }

    public double calculateSalary(double dailyWages, double totalDays) {
        this.dailyWages = dailyWages;
        this.totalDays = totalDays;
        salary = this.dailyWages * this.totalDays;
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "PTEmployee [dailyWages =" + dailyWages + ", totalDays =" + totalDays + "]";
    }

}
