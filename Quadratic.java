import java.util.Scanner;
public class Quadratic{

	// Method to calculate quadratic equation
	public static void quadraticEquation(int a, int b, int c){
	int d = (int) Math.pow(b,2) - 4*a*c;         // Solving for discriminant here
	if(d == 0){             // Write condition for d == 0 
	double x = (-b) / (2.0*a);     // Apply quadratic formula where d == 0
	System.out.println("The roots are real and equal : "+ (x));
	}else if(d > 0){       // Write condition for d > 0 
	double x1 = (-b + Math.sqrt(d))/(2.0*a);    // Apply quadratic formula for x is -/+
        double x2 = (-b - Math.sqrt(d))/(2.0*a);    // Apply quadratic formula for x is -/-
	System.out.println("The roots are real and distinct ");
	System.out.println("x1 : " + (x1) + " And x2 : " + (x2));
	}else{                 // Print the roots are imaginary or complex 
	System.out.println("The roots are complex and imaginary ");
        double real = -b/(2.0*a);    // Calculating for roots are real or not 
	double imag = Math.sqrt(-d) / (2.0*a);  // Calculating for roots are imaginary or not
        System.out.println("x1 : " + real + " + " + imag + "i");
        System.out.println("x2 : " + real + " - " + imag + "i");
	}
	}

	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

	// Taking input from user their cofficient of a, b, c
	System.out.print("Enter your coefficient of b : ");
	int b = sc.nextInt();
	System.out.print("Enter your coefficient of a : ");
	int a = sc.nextInt();
	System.out.print("Enter your constant c : ");
	int c = sc.nextInt();

	quadraticEquation(a,b,c); // Call the method
	
	sc.close();
	}
}
