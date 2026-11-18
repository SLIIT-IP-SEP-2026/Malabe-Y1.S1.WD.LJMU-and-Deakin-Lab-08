import java.util.Scanner;

public class IT26102582Lab8Q1B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int myArray [] = new int[5];
		int evenArray [] = new int[5];
		
		int evenCount = 0;
		
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
		
		System.out.println("myArray Contents:");
		System.out.println(myArray[0] + " " + myArray[1] + " " + myArray[2] + " " +myArray[3] + " " + myArray[4]);
		
		System.out.println();
		
		if (myArray[0] % 2 == 0) {
            evenArray[evenCount] = myArray[0];
            evenCount++;
		}
		
		if (myArray[1] % 2 == 0) {
            evenArray[evenCount] = myArray[1];
            evenCount++;
		}
		
		if (myArray[2] % 2 == 0) {
            evenArray[evenCount] = myArray[2];
            evenCount++;
		}
		
		if (myArray[3] % 2 == 0) {
            evenArray[evenCount] = myArray[3];
            evenCount++;
		}
		
		if (myArray[4] % 2 == 0) {
            evenArray[evenCount] = myArray[4];
            evenCount++;
		}
		
		System.out.println("evenArray Contents:");
		System.out.println(evenArray[0] + " " + evenArray[1] + " " + evenArray[2] + " " + evenArray[3] + " " + evenArray[4]);
		
	}
}