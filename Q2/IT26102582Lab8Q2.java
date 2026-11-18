public class IT26102582Lab8Q2 {
	public static void main(String[] args) {
		
		int A[] = {10, 20, 30, 40, 50};
		int B[] = {34, 67, 12, 89, 12};
		
		int C[] = new int[5];
		
		C[0] = A[0] + B[0];
		C[1] = A[1] + B[1];
		C[2] = A[2] + B[2];
		C[3] = A[3] + B[3];
		C[4] = A[4] + B[4];
		
		System.out.println();
		
		System.out.println("A Array Contents:");
		System.out.println(A[0] + " " + A[1] + " " + A[2] + " " + A[3] + " " + A[4]);
		
		System.out.println();
		
		System.out.println("B Array Contents:");
		System.out.println(B[0] + " " + B[1] + " " + B[2] + " " + B[3] + " " + B[4]);
		
		System.out.println();
		
		System.out.println("C Array Contents (A + B):");
		System.out.println(C[0] + " " + C[1] + " " + C[2] + " " + C[3] + " " + C[4]);
		
		System.out.println();
		
	}
}