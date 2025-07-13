import java.util.Scanner;
class root{
	public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
	System.out.print("Enter your number : ");
       	int x = sc.nextInt();
	int r = (int) Math.sqrt(x);
	System.out.println(r);	
		sc.close();
	}
}
