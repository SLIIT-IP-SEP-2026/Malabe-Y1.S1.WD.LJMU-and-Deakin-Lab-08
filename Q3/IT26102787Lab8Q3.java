public class IT26102787Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {

            System.out.print("Enter a positive number: ");
            numbers[i] = input.nextInt();

            if (numbers[i] <= 0) {
                System.out.println("Error! Enter a positive number.");
                i--;
            }
        }

        int max = numbers[0];

        for (int i = 1; i < 6; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);

        input.close();
    }
}