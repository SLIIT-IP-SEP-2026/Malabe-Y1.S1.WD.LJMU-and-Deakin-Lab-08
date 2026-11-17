
import java.util.Scanner;
public class IT26102620Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];

        for (int i = 0; i < 6; i++) {

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--;
            } else {
                myArray[i] = num;
            }
        }

        int max = myArray[0];

        for (int i = 1; i < 6; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        input.close();
    }
}
