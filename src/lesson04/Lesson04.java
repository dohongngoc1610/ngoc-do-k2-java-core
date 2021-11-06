package lesson04;

/**
 * Created by ngochongdo on 10/21/2021
 */
public class Lesson04 {
    /*  Exercise 01
        A company has 4 employees. Employee have different salary range. We have CEO, Managers and normal employee types.
        * Write a test class to create 4 employees with: 1 CEO, 1 Manager and 2 employees
        * Calculate total salary that company must pay in total monthly
     */
    public static void main(String[] args) {
        new Lesson04().calculateSalaryTotalOfCompanyPerMonth();
    }

    void calculateSalaryTotalOfCompanyPerMonth()
    {
        // Create all member of company
        Employee ceo=new Employee();
        Employee manager=new Employee();
        Employee normalEmployee1=new Employee();
        Employee normalEmployee2=new Employee();
        // Set specific salary for each kind of member. Unit $
        ceo.setEmployeeSalaryPerMonth(10000);
        manager.setEmployeeSalaryPerMonth(7000);
        normalEmployee1.setEmployeeSalaryPerMonth(4000);
        normalEmployee2.setEmployeeSalaryPerMonth(4000);
        // Get monthly salary of company
        double salaryTotalOfCompanyPerMonth=ceo.getEmployeeSalaryPerMonth()+ manager.getEmployeeSalaryPerMonth()+normalEmployee1.getEmployeeSalaryPerMonth()+ normalEmployee2.getEmployeeSalaryPerMonth();

        System.out.println("Salary total of company per month: "+salaryTotalOfCompanyPerMonth+" $");
    }
}
