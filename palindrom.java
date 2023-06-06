import java.util.Scanner;
public class palindrom{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Write a word :");
		String name=sc.next();
		String reverse ="";
		int i;
		int len=name.length();
		for(i=len-1;i>=0;i--){
			reverse = reverse + name.charAt(i);
		}
		if(name.equals(reverse)){
			System.out.println(name + " is Palindrom");
		}
		else{
			System.out.println(name + "is not Palindrom");
		}
	}
}