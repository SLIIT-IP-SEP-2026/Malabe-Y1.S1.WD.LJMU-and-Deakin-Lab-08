
import java.util.Scanner;

public class IT26102428Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];

        int i = 0;

        while (i < 6) {

            System.out.print("Enter a Positive Number (" +
                    (i + 1) + "/6): ");

            int num = input.nextInt();

            if (num <= 0) {
                System.out.println(
                    "Error: Please Enter ONLY Positive Numbers"
                );
            } else {
                myArray[i] = num;
                i++;
            }
        }

        int max = myArray[0];

        for (int j = 1; j < 6; j++) {

            if (myArray[j] > max) {
                max = myArray[j];
            }
        }

        System.out.println("\nArray Contents:");

        for (int j = 0; j < 6; j++) {
            System.out.print(myArray[j] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        input.close();
    }
}
