import java.util.Scanner;

public class Reversestring {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.print("enter a string:");
		String input=scanner.nextLine();

		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
		    reverse += input.charAt (i);
		}
		System.out.println("reverse String:"+ reverse);
	}
}