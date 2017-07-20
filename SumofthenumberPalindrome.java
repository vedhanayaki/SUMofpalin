package player;
import java.util.Scanner;
public class SumofthenumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Number:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a+b==c){
	System.out.println("Number is Palindrome");
}
else{
	System.out.println("Number is NOT Palindrome");
}
	}

}
