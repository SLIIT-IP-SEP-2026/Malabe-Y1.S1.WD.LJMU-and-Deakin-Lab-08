
import java.util.Scanner;

public class IT26102754Lab8Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[6];

        int i = 0;

        while (i < 6) {

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = sc.nextInt();

            if (num > 0) {
                numbers[i] = num;
                i++;
            } 
            else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        int max = numbers[0];

        for (int j = 1; j < 6; j++) {

            if (numbers[j] > max) {
                max = numbers[j];
            }
        }   

        System.out.print("\nArray Contents:");

        for (int j = 0; j < 6; j++) {
            System.out.print(numbers[j] + " ");
        }

        System.out.print("\nThe Maximum Number Entered: " + max);
        
    }
}
