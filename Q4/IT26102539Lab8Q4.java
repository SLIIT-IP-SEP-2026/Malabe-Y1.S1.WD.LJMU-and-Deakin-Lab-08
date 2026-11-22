import java.util.Scanner;

public class IT26102539Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];

        for (int i = 0; i < 8; i++) {
            while (true) {
                System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
                int id = sc.nextInt();
                if (id > 0) {
                    studentsArray[i] = id;
                    break;
                } else {
                    System.out.println("Error: Please Enter ONLY Positive Numbers");
                }
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

        sc.close();
    }
}
