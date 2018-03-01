import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Jagged_Array {
	public static void main(String ...args) throws FileNotFoundException{
		
		File file= new File("C:\\Users\\shmyh\\Desktop\\JaggedArrayTest.txt");
		Scanner scan= new Scanner(file);
		
		int rows,count=0 ; 
		//char[] farr={'a','b','c','d','e','f','g','h','i'};
		//System.out.println("how many rows your arr[][] will have");
		rows=scan.nextInt();
		char arr[][]= new char[rows] [];//main array
		int len[]=new int[rows];//length of each set
		
		while(scan.hasNextLine()&&count<rows){//setting size for each sub arr
			len[count]=scan.nextInt();
			arr[count]=new char [len[count]];
			for(int r=0;r<len[count];r++){
				arr[count][r]=scan.next(".").charAt(0);
				
			}

			count++;
		}
		
		//irows;
		int[] div= new int[rows];
		int total=1;
		for(int b=rows-1;b>=0;b--){
			div[b]=total;			
			
			total*=len[b];//total = all the sets sizes times each other
		}
		//int [] arrprint=new int[];
		for(int combo=0;combo<total;combo++){//new line after every combo
			for(int r=0;r<rows;r++){//new set part is printed after every r
				int temp=combo/div[r];//line number divided by divisor at r
				int di=(int) (temp%len[r]);//temp mod set set len
				System.out.print(arr[r][di]);
			}
			System.out.println();
		}
	}
		
}


