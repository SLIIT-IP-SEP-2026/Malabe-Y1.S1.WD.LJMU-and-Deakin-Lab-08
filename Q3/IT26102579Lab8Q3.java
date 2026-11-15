import java.util.Scanner;

public class IT26102579Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        int i = 0;

        while (i < 6) {

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if (num > 0) {
                numbers[i] = num;
                i++;
            } else {
                System.out.println("Error Please Enter ONLY Positive Numbers");
            }
        }

        int max = numbers[0];

        System.out.println("\nArray Contents:");

        for (i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}