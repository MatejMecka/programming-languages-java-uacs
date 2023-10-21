/*
Write JAVA program which will calculate salary for some employee. The program
has data for the name of the employee and his/her total (gross) salary.
• The program should print out
- State taxes = 28.4 % from the gross salary
- Personal Tax
- If (gross salary – state taxes - 7000) > 0 then
Personal tax = 10% from (gross salary – state tax - 7000)
- else
Personal tax = 0
- Net salary = gross salary – state taxes – personal tax
• All three values should be rounded. (You can use Math.round(variable) method).
*/
import java.util.Random;

class Main {
	public static void main( String args[]) {
        // Convert Percentages to decimal
	    double state_taxes_percentage = 28.4 / 100;
        double personal_taxes_percengate = 10.0 / 100;
        
        // Employee Information
        int employee_salary = 20000;
        String employee_name = "Peter Madison";

        // Calculate State Taxes
        double state_taxes = employee_salary * state_taxes_percentage;
        double personal_tax = 0;


        // Calculate and check if personal tax should be deducted
        double calc = employee_salary - state_taxes - 7000.0;
        if(calc > 0) {
            personal_tax =  calc * personal_taxes_percengate;
        }

        // Print out Employee's info about Salary
        System.out.println("The Employee: " + employee_name + " with Gross Salary of: " + employee_salary + " MKD. Will Get NET Salary: " + (int)(employee_salary - state_taxes - personal_tax));
        System.out.println("State taxes are: " + (int)state_taxes + " MKD.");
        System.out.println("Personal Tax is: " + (int)personal_tax + " MKD.");
    }
}
