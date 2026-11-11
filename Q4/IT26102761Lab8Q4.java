import java.util.Scanner;

public class IT26102761Lab8Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int studentsArray[] = new int[8];

        for (int i = 0; i < 8; ) {

            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
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