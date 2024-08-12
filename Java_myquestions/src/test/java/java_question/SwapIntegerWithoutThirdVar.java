package java_question;

// How to Swap 2 integers without creating third variable
public class SwapIntegerWithoutThirdVar {

	public static void main(String[] args) {
		
		        int x = 5;
		        int y = 10;

		        // Without using third var: using + operator
		        x = x + y; // x becomes 15
		        y = x - y; // y becomes 5
		        x = x - y; // x becomes 10

		        // Without using third var: using * operator
		        // (Not efficient, can lead to overflow)
		        // x = x * y;
		        // y = x / y;
		        // x = x / y;

		        // Using XOR:
//		        x = x ^ y; // 15 (in binary: 1111)
//		        y = x ^ y; // 10 (in binary: 1010)
//		        x = x ^ y; // 5 (in binary: 0101)

		        System.out.println(x);
		        System.out.println(y);
	
	}
}





















