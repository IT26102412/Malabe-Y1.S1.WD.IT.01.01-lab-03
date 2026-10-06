import java.util.Scanner;
public class IT26102412Lab3Q2{
	public static void main(String[]args){
		
		double monthlySalary, otHours, otHourlyRate, otAmount, totalSalary;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the monthly salary: ");
		monthlySalary = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		otHours = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		otHourlyRate = input.nextDouble();
		
		otAmount = otHours*otHourlyRate;
		totalSalary = monthlySalary + otAmount;
		
		System.out.println();
		System.out.println("The total salary including OT is: "+totalSalary);
		
	}
}