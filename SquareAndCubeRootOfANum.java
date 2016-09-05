import java.util.Scanner;

public class SquareAndCubeRootOfANum {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = scan.nextInt();
		
		double squareRootOfNum = Math.sqrt(num);
		double cubeRootOfNum = Math.cbrt(num);
		
		System.out.println("Square root of "+num+" is: "+squareRootOfNum);
		System.out.println("Cube root of "+num+" is: "+cubeRootOfNum);
	}
}
