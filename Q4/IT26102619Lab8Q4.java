import java.util.Scanner;
public class IT26102619Lab8Q4 {
    public static void main(String[] args) { 
	
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int count = 0;

        // Input 8 positive Student IDs
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int id = input.nextInt();

            if (id > 0) {
                studentsArray[count] = id;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // Search for a Student ID
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
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

        input.close();
    }
}