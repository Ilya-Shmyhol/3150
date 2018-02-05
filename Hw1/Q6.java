import java.util.Scanner;

public class Q6 {
	public static void main (String args[]){
		
		double x1,y1,x2,y2,r1,r2, dist; //x1 y1 r1 belong to circle one x2 y2 r2 belong to circle 
		Scanner reader= new Scanner(System.in);
		while( reader.hasNextDouble()){
		System.out.println("Please Enter the 1st coordinate of the 1st circle");
		x1=reader.nextDouble();
		System.out.println("x1= "+x1);
		System.out.println("Please Enter the 2nd coordinate of the 1st circle");
		y1=reader.nextDouble();
		System.out.println("y2= "+y1);
		System.out.println("Please Enter the radius of the 1st circle");
		r1=reader.nextDouble();
		System.out.println("r1= "+r1);
		System.out.println("Please Enter the 1st coordinate of the 2nd circle");
		x2=reader.nextDouble();
		System.out.println("x2= "+x2);
		System.out.println("Please Enter the 2nd coordinate of the 2nd circle");
		y2=reader.nextDouble();
		System.out.println("y2= "+y2);
		System.out.println("Please Enter the radius of the 2nd circle");
		r2=reader.nextDouble();
		System.out.println("r2= "+r2);
		
		dist= Math.pow(Math.pow((x1-x2),2)+(Math.pow((y1-y2),2)), .5);
		System.out.println("The distance is: "+ dist);
		if(dist ==r1+r2)System.out.println("These circles do touch");
		else if((x1==x2)&&(y1==y2)&&(r1==r2))System.out.println("These circles are the same");
			else if(dist >(r1+r2)) 	System.out.println("These circles do not touch");
					else if(dist<= Math.abs(r1-r2))System.out.println("The 2nd circle is inside the 1st circle");
						else if(dist<= Math.abs(r2-r1))System.out.println("The 1st circle is inside the 2nd circle");
							else if (dist<(r1+r2))System.out.println("The circles overlap");
								else System.out.println("Some kind of error!");
		}
		reader.close();
		
	}

}
