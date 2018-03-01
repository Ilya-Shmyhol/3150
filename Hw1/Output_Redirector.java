import java.util.Scanner;

public class Output_Redirector {
	public static void main(String args []){

		Scanner reader= new Scanner(System.in);

		while(reader.hasNextDouble()){
			System.out.print(reader.nextDouble());
		}

		reader.close();
	}

}
