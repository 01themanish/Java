import java.util.Scanner;

public class salaryCalculator {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);){
            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();

            System.out.print("Enter HRA: ");
            double hra = sc.nextDouble();

            System.out.print("Enter DA: ");
            double da = sc.nextDouble();

            System.out.print("Enter Tax Deduction: ");
            double tax = sc.nextDouble();

            System.out.print("Enter PF Deduction: ");
            double pf = sc.nextDouble();

            double grossSalary = basic + hra + da;
            double totalDeduction = tax + pf;
            double netSalary = grossSalary - totalDeduction;

            System.out.println("\n----- Salary Details -----");
            System.out.println("Gross Salary: " + grossSalary);
            System.out.println("Total Deduction: " + totalDeduction);
            System.out.println("Net Salary: " + netSalary);

            sc.close();
        }
    }
}