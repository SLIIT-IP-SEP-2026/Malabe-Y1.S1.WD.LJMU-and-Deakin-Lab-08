import java.util.Scanner;

public class IT26102660Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            studentsArray[i] = input.nextInt();
            if (studentsArray[i] <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = input.nextInt();

        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}
