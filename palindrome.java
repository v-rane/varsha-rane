package sebone;
import java.util.*;
public class palindrome {
 public static void main(String[] args) {
	int sum=0,r,temp;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the num");
		int num = scan.nextInt();
		scan.close();
	    temp =num;
		while(num>0) {
			r =num%10;
			sum =(sum*10)+r;
			num=num/10;	
		}
		if(sum==temp) 
		 System.out.println("no is palindrome");
		 else
			 System.out.println("no is not palindrome");
		 
		}
}




