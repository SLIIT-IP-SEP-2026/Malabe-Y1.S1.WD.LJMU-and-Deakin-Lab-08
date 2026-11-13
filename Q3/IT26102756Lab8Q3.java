import java.util.Scanner;

public class IT26102756Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        int i = 0;
        while (i < numbers.length) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int input = sc.nextInt();

            if (input > 0) {
                numbers[i] = input;
                i++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        System.out.println("\nArray Contents:");
        int max = numbers[0];
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        sc.close();
    }
}