import java.util.Scanner;

public class Q5 {
	public static void main(String args[]){
		
		Scanner reader= new Scanner(System.in);
		double s1, s2 , s3;
		int[] arr = new int[6];
		//even numbers are Xs and odds are Ys
		//0,1 2,3 4,5
		
		while(reader.hasNextInt()){
		for(int i=0; i<3;i++) {
			int x,y;
			arr[i]=reader.nextInt();
			x=arr[i];
			arr[i+1]=reader.nextInt();
			y=arr[i+1];
			System.out.printf("Number %d coordinates are X= %d and Y= %d  \n",i,x,y);
		}
		
		s1=Math.sqrt(Math.pow((arr[2]-arr[0]),2)+(Math.pow((arr[3]-arr[1]),2)));
		s2=Math.sqrt(Math.pow((arr[4]-arr[0]),2)+(Math.pow((arr[5]-arr[1]),2)));
		s3=Math.sqrt(Math.pow((arr[2]-arr[4]),2)+(Math.pow((arr[4]-arr[5]),2)));
		if((s3<(s1+s2))&& ((s2<(s3+s2)) && (s1<(s3+s2)))){ 
			System.out.println("This is NOT a real triangle \n");
		}
		else System.out.println("This is a real triangle \n");
		}

		reader.close();
	}
	
}