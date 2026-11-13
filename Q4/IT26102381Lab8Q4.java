import java.util.Scanner;


public class IT26102381Lab8Q1B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numSize = 8;
        int numArray[] = new int[numSize];

        for (int i = 0; i < numSize; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int userNum = sc.nextInt();

            if (userNum < 0) {
                System.out.println("error: Please Enter ONLY Positive Numbers");
                i--;
            } else {
                numArray[i] = userNum;
            }
        }

        // check availability of student ID
        boolean terminate = false;
        int terminateNum = -99;
        while (!terminate) {
            System.out.print("\nEnter Student ID to Check Availability: ");
            int userNum = sc.nextInt();

            if (userNum < 0) {
                if (userNum == terminateNum) {
                    terminate = true;
                    System.out.println("Terminating Program...");
                } else {
                    System.out.println("error: Please Enter ONLY Positive Numbers");
                }
            } else {
                boolean found = false;
                for (int i = 0; i < numSize; i++) {
                    if (numArray[i] == userNum) {
                        found = true;
                    }
                }

                if (found) {
                    System.out.println("Student is Available");
                } else {
                    System.out.println("Student is NOT Available");
                }
            }
        }

        sc.close();
    }

}