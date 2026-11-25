import java.util.Scanner;

public class IT26102438Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        while (count < numbers.length) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int number = input.nextInt();

            if (number <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[count] = number;
                count++;
            }
        }

        int max = numbers[0];

        System.out.println();
        System.out.println("Array Contents:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);
    }
}
