import java.util.Scanner;


public class checkevenorodd {
	public static void main(String[] args) {
	     Scanner scanner=new Scanner(System.in);

	     System.out.print("enter a number:");
	     int num=scanner.nextInt();

 	     if(num%2==0) {
	     System.out.println(num+"is even:");
	     } else {
                System.out.println(num+"is odd:");
	        }
	}
}
