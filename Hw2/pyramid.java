import java.util.Scanner;
public class pyramid {
	public static void  main(String arg[]){
		int num,c, linenum=0;
		Scanner reader= new Scanner(System.in);
		
		System.out.println("Please enter the number of lines you want");
		c=num= reader.nextInt();
		for(int i=0;i<num;i++){
			c--;
			linenum++;
			for(int j=0;j<c;j++){//print spaces
				System.out.print("   ");
				//
			}//print the digits
			//using line num we need to print every value less than line num 
			//starting at one, then line num then every number less than line num ending at zero
			//line num and 
			//System.out.print(c);
			for(int b=1;b<linenum;b++){
				if(b<10)System.out.print("  ");
				else System.out.print(" ");
				System.out.print(b);
			}
			
				System.out.print(" ");
			//System.out.print(linenum);
			for(int d=linenum;d>0;d--){
				if(d<10)System.out.print("  ");
				else System.out.print(" ");
				System.out.print(d);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

}
//logic first line 3 spaces and 1, seconed line 
