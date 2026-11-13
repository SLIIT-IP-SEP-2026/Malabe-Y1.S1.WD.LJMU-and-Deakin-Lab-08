public class IT26102381Lab8Q1B {

    public static void main(String[] args) {

        int A[] = {10, 20, 30, 40, 50};
        int B[] = {34, 67, 12, 89, 12};

        int C[] = new int[5];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }

        // for printing
        String array_A, array_B, array_C;
        array_A = array_B = array_C = "";
        for (int i = 0; i < A.length; i++) {
            array_A += A[i] + " ";
            array_B += B[i] + " ";
            array_C += C[i] + " ";
        }

        System.out.println("Array A: \n" + array_A + "\n");
        System.out.println("Array B: \n" + array_B + "\n");
        System.out.println("Array C (A + B): \n" + array_C + "\n");
    }

}