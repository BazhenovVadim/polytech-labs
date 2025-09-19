package polytech.first_laba;


public class HRDepartament {
    private String name;
    private long countMembers;
    private int timeNorm;
    private int salaryInHour;
    private float tax;

    public HRDepartament(String name, long countMembers, int timeNorm, int salaryInHour, float tax) {
        this.name = name;
        this.countMembers = countMembers;
        this.timeNorm = timeNorm;
        this.salaryInHour = salaryInHour;
        this.tax = tax;
    }

    public HRDepartament(){}

    public float calculateSalary(int salaryInHour, float tax, int timeNorm) {
        if (salaryInHour < 0 || timeNorm < 0 || tax < 0) {
            System.out.println("Параметры для расчета должны быть положительными числами");
            return 0;
        }
        return  salaryInHour * timeNorm - (salaryInHour * timeNorm) * tax / 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCountMembers() {
        return countMembers;
    }

    public void setCountMembers(long countMembers) {
        this.countMembers = countMembers;
    }

    public int getTimeNorm() {
        return timeNorm;
    }

    public void setTimeNorm(int timeNorm) {
        this.timeNorm = timeNorm;
    }

    public int getSalaryInHour() {
        return salaryInHour;
    }

    public void setSalaryInHour(int salaryInHour) {
        this.salaryInHour = salaryInHour;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
}
