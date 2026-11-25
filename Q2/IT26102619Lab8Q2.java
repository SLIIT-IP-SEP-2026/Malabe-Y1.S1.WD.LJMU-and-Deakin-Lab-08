public class IT26102619Lab8Q2 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Adding numbers A and B into C 
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        // Print A array
        System.out.println("A Array Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Print B array
        System.out.println("B Array Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Print C array
        System.out.println("C Array Contents (A + B):");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}