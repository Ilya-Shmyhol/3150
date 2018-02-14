import java.util.Scanner;
public class cal {
	public static void main(String args[]){
	//enter 1st of jan
	//enter year
		int year, numberOfDayInMonth ;//4 is thurs numberOfDayInMonth= number of day in week piw position in week matlim total number of days in month
		String[] moonth = new String[12];
		String[] dayOfWeek = new String[7];//set arr 5 because thursday?
		Integer[] monthlim =new Integer[13];
		double piw;
		Scanner reader= new Scanner(System.in);

		moonth[0]= "January";
		moonth[1]= "February";	
		moonth[2]= "March";	
		moonth[3]= "April";		
		moonth[4]= "May";		
		moonth[5]= "June";		
		moonth[6]= "July";		
		moonth[7]= "August";		
		moonth[8]= "September";		
		moonth[9]= "October";		
		moonth[10]= "November";		
		moonth[11]= "December";		

		dayOfWeek[0] = "Sun";
		dayOfWeek[1] = "Mon";
		dayOfWeek[2] = "Tue";
		dayOfWeek [3]= "Wed";
		dayOfWeek [4] = "Thu";
		dayOfWeek [5] = "Fri";
		dayOfWeek [6]= "Sat";
		
		System.out.println("What year? -Reese, The Terminator(1984)");
		year=reader.nextInt();
		System.out.println("\n"+ "What day of the week is the 1st of Jan? \n"+ 
			"1 for Sunday,\n"+"2 for Monday,\n"+ "3 for Tuesday,\n"+ 
			"4 for Wednesday,\n"+ "5 for Thursday,\n"+ "6 for Friday,\n"+
			"7 for Saturday ");
		numberOfDayInMonth=reader.nextInt()-1;
		piw=numberOfDayInMonth;
		for(int d=0; d<12;d++){
		      int monthlimc=1;//monthlim counter

				System.out.println("\n"+"\t \t  "+ moonth[d]+"  "+ year);

				
				//What month SIDE NOTES: 365 days in a year
				
				monthlim[0]=31;
				monthlim[1]=28; //29 every 4th
				monthlim[2]=31;
				monthlim[3]=30;
				monthlim[4]=31;
				monthlim[5]=30;
				monthlim[6]=31;
				monthlim[7]=31;
				monthlim[8]=30;
				monthlim[9]=31;
				monthlim[10]=30;
				monthlim[11]=31;
				
				if(year%4==0){
				    monthlim[1]=29;
				}
				//Prints day of the week (mon, tues,etc) MAKE METHOD PLEASE
				for(int g=0;g<7;g++){//print  dayOfWeek(4) 7 times
				
					System.out.print(dayOfWeek[g]);
					System.out.print("\t");
					//if(numberOfDayInMonth==7)numberOfDayInMonth=0;
					//else numberOfDayInMonth++;
				//	if (numberOfDayInMonth==6) numberOfDayInMonth=0;
				}
				//limit for every month 31 in jan 28 in feb NEED ANOTHER ARRAY?
				System.out.print("\n  ");
				for(int r=1;r<piw;r++){//prints spaces for no dated(-1st) dates (monday)
					System.out.print("\t");
;
				}

				
				while(monthlimc<=monthlim[d]){
					while((piw%8!=0)&&(monthlimc<=monthlim[d])){
						System.out.print(monthlimc);
						
						monthlimc++;
						System.out.print("\t");
						piw++;
					}
					System.out.print("\n");
					//monthlimc+=piw;
					if(monthlimc<=monthlim[d]) piw=1;
					
				}		
				
			}
		}
	}