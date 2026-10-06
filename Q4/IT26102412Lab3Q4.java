import java.util.Scanner;
public class IT26102412Lab3Q4{
	
	public static void main(String[]args){
		
		int number, digit1, digit2, digit3, digit4, digit5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five-digit number: ");
		number = input.nextInt();
		
		digit1 = number/10000 ;
		number = number % 10000;
		
		digit2 = number/1000;
		number = number % 1000;
		
		digit3 = number/100;
		number = number % 100;
		
		digit4 = number/10;
		number = number % 10;
		
		digit5 = number;
		
		System.out.print(digit1 +" ");
		System.out.print(digit2 +" ");
        System.out.print(digit3 +" ");
		System.out.print(digit4 +" ");
		System.out.print(digit5);
		
	}
	
}
		