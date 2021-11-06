package lesson04;

/**
 * Created by ngochongdo on 10/21/2021
 */
public class Employee {
    private String employeeID;
    private String employeeName;
    private double employeeSalaryPerMonth; // Unit $
    private int workingMonthOfYear;

    public Employee() {
    }

    public Employee(String employeeID, String employeeName, double employeeSalaryPerMonth, int workingMonthOfYear) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalaryPerMonth = employeeSalaryPerMonth;
        this.workingMonthOfYear = workingMonthOfYear;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeSalaryPerMonth(double employeeSalaryPerMonth) {
        this.employeeSalaryPerMonth = employeeSalaryPerMonth;
    }

    public void setWorkingMonthOfYear(int workingMonthOfYear) {
        this.workingMonthOfYear = workingMonthOfYear;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalaryPerMonth() {
        return employeeSalaryPerMonth;
    }

    public int getWorkingMonthOfYear() {
        return workingMonthOfYear;
    }
}
