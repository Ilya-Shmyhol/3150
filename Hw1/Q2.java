import java.util.Scanner;
//import java.math.*;

/*
*/
public class Q2{
	public static void main(String[] args){
		
		double p=Math.PI;
		double r, area;
		
		Scanner reader= new Scanner(System.in);
		System.out.print("Please enter the raduis \n");
		
		while(reader.hasNextDouble()){
			
			r= reader.nextDouble();
			System.out.printf("Raduis entered: %.3f \n" , r);
			area =p * (Math.pow(r, 2));
			System.out.printf("The area of your circle is: %.3f \n",area);
			System.out.print("Please enter the radius \n");

		}
		reader.close();
	}
}