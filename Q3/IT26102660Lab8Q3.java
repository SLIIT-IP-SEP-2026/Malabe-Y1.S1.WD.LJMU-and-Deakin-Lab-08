import java.util.Scanner;

public class IT26102660Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] positiveArray = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            positiveArray[i] = input.nextInt();
            if (positiveArray[i] <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--; 
            }
        }
        
        System.out.println("\nArray Contents:");
        for (int i = 0; i < 6; i++){
            System.out.print(positiveArray[i] + (i == 5 ? "" : " "));
        }

        int max = positiveArray[0];
        for (int i = 1; i < 6; i++) {
            if (positiveArray[i] > max) {
                max = positiveArray[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}
