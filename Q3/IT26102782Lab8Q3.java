import java.util.Scanner;
public class IT26102782Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int max = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--;
            } else {
                numbers[i] = num;
            }
        }

        max = numbers[0];
        for (int i = 0; i < 6; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Array Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}