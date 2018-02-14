import java.util.Scanner; 
public class isPalindrome{
	public static void main(String args[]){
		
		String wrd= "racecar", cmp;
		int size, pos=0;
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Please enter your Palindrome followed by enter key");
		wrd= reader.nextLine();
		size=wrd.length();
		while(pos<=(size/2)){
			String temp;
			temp=wrd.substring(pos, pos+1);
			if(!temp.equals(wrd.substring(size-(pos+1),size-pos))){
				System.out.println(wrd+ " is not a palindrome!");
				System.exit(1);;
			}
			pos++;
		}
		System.out.println(wrd+ " is a palindrome!");
//logic racecar pos=0 size=7, enter while loop, temp=r, 
//r is cmp to wrd@(7-(pos+1) goal is 6
		
		
		

	}
}