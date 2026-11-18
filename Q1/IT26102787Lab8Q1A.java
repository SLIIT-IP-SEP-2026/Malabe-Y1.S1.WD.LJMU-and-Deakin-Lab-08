public class IT26102787Lab8Q1A {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            myArray[i] = input.nextInt();
        }

        System.out.println("Numbers in reverse order:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

        input.close();
    }
}