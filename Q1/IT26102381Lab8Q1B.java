import java.util.Scanner;


public class IT26102381Lab8Q1B {

    public static void main(String[] args) {

        int numSize = 5;
        int numArray[] = new int[numSize];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");

        for (int i = 0; i < numSize; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numArray[i] = sc.nextInt();
        }

        System.out.println("\nnumArray Contents: ");

        int evenNumSize = 0; // variable to store the size of even numbers for the evenNumArray
        for (int i = 0; i < numSize; i++) {
            System.out.print(numArray[i] + " ");
            evenNumSize = (numArray[i] % 2 == 0) ? evenNumSize + 1 : evenNumSize;
        }

        // store even numbers in a new array
        int evenNumArray[] = new int[evenNumSize];
        int evenNumArrayIndex = 0;

        for (int i = 0; i < numSize; i++) {
            if (numArray[i] % 2 == 0) {
                evenNumArray[evenNumArrayIndex++] = numArray[i];
            }
        }

        System.out.println("\n\nevenNumArray Contents: ");
        for (int i = 0; i < evenNumSize; i++) {
            System.out.print(evenNumArray[i] + " ");
        }

        sc.close();
    }

}