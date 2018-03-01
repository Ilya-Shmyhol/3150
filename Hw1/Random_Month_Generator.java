import java.util.concurrent.ThreadLocalRandom;

public class Random_Month_Generator  {
		public static void main(String args[]){
			String month;
			for(int z=0; z<12; z++){
			int i= ThreadLocalRandom.current().nextInt(1, 13);
			switch (i){
			case 1: month= "January";
				break;
			case 2: month= "February";
				break;
			case 3: month= "March";
				break;
			case 4: month = "April";
				break;
			case 5: month = "May";
				break;
			case 6: month ="June";
				break;
			case 7: month= "July";
				break;
			case 8: month = "August";
				break;
			case 9: month = "September";
				break;
			case 10: month= "October";
				break;
			case 11: month ="Novemeber";
				break;
			case 12: month = "December";
				break;
			default: month = "mistake";
			
			}
			System.out.print(month);
			}
			
		}

}
