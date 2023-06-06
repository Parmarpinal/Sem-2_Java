import java.util.Scanner;
public class quit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Para p1=new Para();
		System.out.println("Enter paragraph and write quit at the end:");
		p1.sentence=sc.nextLine();
		p1.countVowel();
	}
}

class Para{
	String sentence;
	int count=0;

	void countVowel(){
		int index=sentence.indexOf("quit");

		for(int i=0;i<index;i++){
			if(sentence.charAt(i)=='a' || sentence.charAt(i)=='e' || sentence.charAt(i)=='i' || sentence.charAt(i)=='o' || sentence.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println("Total no of vowel characters="+(count+2));
	}
}