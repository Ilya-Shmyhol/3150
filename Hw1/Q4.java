import java.util.Scanner;

public class Q4 {
	public static void main(String args []){

		Scanner reader= new Scanner(System.in);

		while(reader.hasNextDouble()){
			System.out.print(reader.nextDouble());
		}

		reader.close();
	}

}
