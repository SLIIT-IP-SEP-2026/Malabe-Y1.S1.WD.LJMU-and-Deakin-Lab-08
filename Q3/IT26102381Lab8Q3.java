import java.util.Scanner;


public class IT26102381Lab8Q1B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numSize = 6;
        int numArray[] = new int[numSize];

        for (int i = 0; i < numSize; i++) {
            System.out.print("Enter a Positive Number " + "(" + (i + 1) + "/" + numSize + "): ");
            int userNum = sc.nextInt();

            if (userNum < 0) {
                System.out.println("error: Please Enter ONLY Positive Numbers");
                i--;
            } else {
                numArray[i] = userNum;
            }
        }

        System.out.println("\nnumArray Contents: ");

        // finding max number
        int maxNum = numArray[0];
        for (int i = 0; i < numSize; i++) {
            System.out.print(numArray[i] + " ");
            if (numArray[i] > maxNum) {
                maxNum = numArray[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered is: " + maxNum);

        sc.close();
    }

}