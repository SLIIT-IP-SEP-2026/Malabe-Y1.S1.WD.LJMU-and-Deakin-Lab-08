import java.util.Scanner;

public class IT26102662Lab8Q1A {
	
    public static void main(String[] args) {
		
        Scanner value = new Scanner(System.in);

        int myArray[] = new int[5];

        System.out.println("Enter 5 Numbers: ");

        
        for (int num = 0; num < 5; num++) {
			
            System.out.print("Enter Number " + (num + 1) + ": ");
			
            myArray[num] = value.nextInt();
        }

        System.out.println("Array in Reverse Order: ");

       
        for (int num = 4; num >= 0; num--) {
			
            System.out.print(myArray[num]);
        }
    }
}