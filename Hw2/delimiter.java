import java.util.Scanner;
import java.util.StringTokenizer;
public class delimiter {
	public static void main(String args[]){
		String str=("This is, a funny comment,with: improper commas");
		
		Scanner read= new Scanner(str).useDelimiter("\\s*,\\s*");
		
		//StringTokenizer str = new StringTokenizer("This is, a funny comment,with: improper commas");
		//read.useDelimiter(",*");
		while(read.hasNextLine()){
			
			
			System.out.println(read.next());
			
		}
		read.close();
	}

}
