

public class IT26102758Lab8Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            myArray[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            if (myArray[i] % 2 == 0) {
                evenArray[count] = myArray[i];
                count++;
            }
        }

        System.out.println("Even numbers:");

        for (int i = 0; i < count; i++) {
            System.out.println(evenArray[i]);
        }

        input.close();
    }
}