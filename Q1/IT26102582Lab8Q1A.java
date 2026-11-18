import java.util.Scanner;

public class IT26102582Lab8Q1A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int myArray [] = new int[5];
		
		System.out.println("Enter 5 Numbers:");
		
		System.out.print("Enter Number 1: ");
		myArray[0] = input.nextInt();
		
		System.out.print("Enter Number 2: ");
		myArray[1] = input.nextInt();
		
		System.out.print("Enter Number 3: ");
		myArray[2] = input.nextInt();
		
		System.out.print("Enter Number 4: ");
		myArray[3] = input.nextInt();
		
		System.out.print("Enter Number 5: ");
		myArray[4] = input.nextInt();
		
		System.out.println();
		
		System.out.println("Array in Reverse Order:");
		System.out.print(myArray[4] + " " + myArray[3] + " " + myArray[2] + " " +myArray[1] + " " + myArray[0]);
		
	}
}