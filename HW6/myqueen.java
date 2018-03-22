import java.util.Scanner;

public class myqueen {
	
	static int tb=0;

	public static void main(String... args) {
		
		Scanner reader= new Scanner(System.in);
        System.out.println("Enter the size of the board");
		int n=  reader.nextInt();
		count(n);
		reader.close();
		System.out.println("total number of combos is: "+tb);
    }
	public static void count(int n) {//start function
	        int[] a = new int[n];
	        count(a, 0);        
	}
	
	public static void count(int[] q, int k) {
	    int n = q.length;
	     
	    if (k == n){ 
	    	tb++;
	    	printBoard(q);
	    }
	        else {
	            for (int i = 0; i < n; i++) {   
	                q[k] = i;
	                if (check(q, k)){//
	                	int sendin=k+1;
	                	//System.out.println("Q!");
	                	 //printBoard(q);
	                	count(q, sendin);//check the next position k+1 moves you to the enxt row
	                }
	            }
	        }
	    }  



    public static boolean check(int[] q, int n) {
        for (int i = 0; i < n; i++) {//i+1 is what row your are in 
        	//TODO check if the queen hits anything! (done)
        	//System.out.println("here!q[i] + q[n] is: "+q[i] + q[n]);
        	//System.out.println("here! i + n is: "+i + n+"\n");
            if ((q[i] == q[n])||((q[i] - q[n]) == (n - i))||((q[n] - q[i]) == (n - i)))        
            	return false;   
            	//(q[i] == q[n]) same column ((q[i] - q[n]) == (n - i)) same right diagonal ((q[n] - q[i]) == (n - i)) same left diagonal
        }
        return true;
    }

    public static void printBoard(int[] q) {
        int n = q.length;
        for (int i = 0; i < n; i++) {//row
            for (int j = 0; j < n; j++) {//if placecolumn 
                if (q[i] == j) System.out.print("Q ");
               
                else System.out.print("# ");
            }
            System.out.println();
        }  
        System.out.println();
    }
    
   
}


