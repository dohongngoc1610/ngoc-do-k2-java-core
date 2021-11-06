package lesson05;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ngochongdo on 10/21/2021
 */
public class Lesson05 {
    /*  Exercise 01
        A company has 4 employees. method01.Employee have different salary range. We have CEO, Managers and normal employee types.
        * Write a test class to create 4 employees with: 1 CEO, 1 Manager and 2 employees
        * Calculate total salary that company must pay in total monthly
     */
    public static void main(String[] args) {
        new Lesson05().calculateSalaryTotalOfCompanyPerMonth();
    }

    void calculateSalaryTotalOfCompanyPerMonth()
    {
        // Create all member of company
        List<Employee> employeeList=new ArrayList<>();

        Employee ceo=new CEO(); employeeList.add(ceo);
        Employee manager=new Manager(); employeeList.add(manager);
        Employee normalEmployee1=new NormalEmployee(); employeeList.add(normalEmployee1);
        Employee normalEmployee2=new NormalEmployee(); employeeList.add(normalEmployee2);

        // Get monthly salary of company. Unit $
        double salaryTotalOfCompanyPerMonth=0;
        for (Employee employee:employeeList) {
            salaryTotalOfCompanyPerMonth=salaryTotalOfCompanyPerMonth+employee.getEmployeeSalaryPerMonth();
        }

        System.out.println("Salary total of company per month: "+salaryTotalOfCompanyPerMonth+" $");
    }
}
