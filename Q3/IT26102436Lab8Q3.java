import java.util.Scanner;

public class IT26102436Lab8Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
                int input = scanner.nextInt();

                if (input > 0) {
                    numbers[i] = input;
                    break;
                } else {
                    System.out.println("Error: Please Enter ONLY Positive Numbers");
                }
            }
        }

        System.out.println("Array Contents:");
        int max = numbers[0];
        for (int num : numbers) {
            System.out.print(num + " ");
            if (num > max) {
                max = num;
            }
        }
        System.out.println();

        System.out.println("The Maximum Number Entered: " + max);

        scanner.close();
    }
}