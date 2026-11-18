import java.util.Scanner;

public class IT26102566Lab8Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int count = 0;

        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // copy the even numbers into evenArray
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        System.out.println("\nEven numbers in the array:");
        if (count == 0) {
            System.out.println("No even numbers were entered.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(evenArray[i]);
            }
        }
    }
}
