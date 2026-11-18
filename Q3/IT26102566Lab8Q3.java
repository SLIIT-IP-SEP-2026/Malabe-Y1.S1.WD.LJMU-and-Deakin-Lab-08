import java.util.Scanner;

public class IT26102566Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];
        int i = 0;

        // keep asking until 6 positive numbers are stored
        while (i < numbers.length) {
            System.out.print("Enter positive number " + (i + 1) + ": ");
            int value = input.nextInt();

            if (value <= 0) {
                System.out.println("Error! Please enter a positive number.");
            } else {
                numbers[i] = value;
                i++;
            }
        }

        int max = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        System.out.println("\nMaximum number is: " + max);
    }
}
