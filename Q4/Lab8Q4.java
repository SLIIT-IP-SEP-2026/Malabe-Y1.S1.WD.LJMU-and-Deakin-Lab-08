import java.util.Scanner;

public class IT26102753Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studentsArray = new int[8];

        for (int i = 0; i < 8; ) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Invalid Student ID");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("Enter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchId) {
                found = true;