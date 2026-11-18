import java.util.Scanner;

public class IT26102582Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numbers[] = new int[6];
        int count = 0;

        while (count < 6) {

            System.out.print(
                    "Enter a Positive Number ("
                    + (count + 1) + "/6): "
            );

            int number = input.nextInt();

            if (number <= 0) {

                System.out.println(
                        "Error: Please Enter ONLY Positive Numbers"
                );

            } else {

                numbers[count] = number;
                count++;
            }
        }

        int maximum = numbers[0];

        if (numbers[1] > maximum) {
            maximum = numbers[1];
        }

        if (numbers[2] > maximum) {
            maximum = numbers[2];
        }

        if (numbers[3] > maximum) {
            maximum = numbers[3];
        }

        if (numbers[4] > maximum) {
            maximum = numbers[4];
        }

        if (numbers[5] > maximum) {
            maximum = numbers[5];
        }

        System.out.println();

        System.out.println("Array Contents:");

        System.out.println(
                numbers[0] + " "
                + numbers[1] + " "
                + numbers[2] + " "
                + numbers[3] + " "
                + numbers[4] + " "
                + numbers[5]
        );

        System.out.println(
                "The Maximum Number Entered: " + maximum
        );
    }
}