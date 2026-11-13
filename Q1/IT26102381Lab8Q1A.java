import java.util.Scanner;


public class IT26102381Lab8Q1A {

    public static void main(String[] args) {

        int numSize = 5;
        int numArray[] = new int[numSize];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < numSize; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numArray[i] = sc.nextInt();
        }

        System.out.println("\nArray in Reverse Order: ");
        for (int i = numSize; i > 0; i--) {
            System.out.print(numArray[i-1] + " ");
        }

        sc.close();
    }

}