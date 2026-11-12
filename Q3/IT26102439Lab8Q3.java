import java.util.Scanner;

public class IT26102439Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < numbers.length; i++) {

            while (true) {

                System.out.print("Enter a Positive Number (" +
                        (i + 1) + "/6): ");

                int number = input.nextInt();

                if (number > 0) {
                    numbers[i] = number;
                    break;
                } else {
                    System.out.println(
                            "Error: Please Enter ONLY Positive Numbers"
                    );
                }
            }
        }

        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("\nArray Contents:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + maximum);

        input.close();
    }
}