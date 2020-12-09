package Day05_Concatenation;

public class SalaryCalculator {

    public static void main(String[] args) {
        // SalaryCalculate
       double salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21 ;
        double stateTax = stateTaxRate * salary;
        double federalTax = federalTaxRate * salary;
        double totalTax = stateTax + federalTax ;
        double salaryAfterTax = salary - totalTax;


        System.out.println("Salary is: " + salary);
        System.out.println("State tax is: " + stateTax);
        System.out.println("Federal Tax is: " + federalTax);
        System.out.println("Total Tax is: " + totalTax);
        System.out.println("Salary after tax is: " + salaryAfterTax);

            }
        }


/*
Task: SalaryCalculator

    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
    output:
           100000       0.08          0.21
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax

 */