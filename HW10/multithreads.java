import java.util.concurrent.atomic.AtomicInteger;

public class multithreads {
	
	static Object lock=new Object();
	
	int status=0;
	public static void main(String...args){

		multithreads multithreads = new multithreads();
		//Thread mythread= new Thread (new A());
		//mythread.run();
		//for(int i =0; i<26; i++ )	System.out.println(alpha[i]);
        	A t = new A ( multithreads);
       		B t1 = new B( multithreads);
        	C t2 = new C( multithreads);
        	D t3 = new D( multithreads);
        	t.start();
		t1.start();
        	t2.start();
       		t3.start();
        
	}
	
}class A extends Thread{	
		 multithreads multithreads;

   		 A(multithreads multithreads){
       			 this.multithreads = multithreads;
   		 } 
   		@Override public void run(){
		String [] alpha =new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; 
		try {	
			synchronized(multithreads) {  
				for (int i = 0; i < 7; i++) { 
					while(multithreads.status%4!=0){
                       				multithreads.wait();
                   			}      	
			//System.out.println(counter.get());
			System.out.println(Thread.currentThread().getName() +alpha[multithreads.status]); 
			//System.out.println(
			//counter.getAndIncrement(); 
			
			
		
		  multithreads.status ++;
                    multithreads.notifyAll();
				}
			}
		}catch (InterruptedException ie )
		{ System.out.println("Child HEREthread interrupted! " + ie); 
		} 
	}
	
		
	 }
class B extends Thread{	
	 multithreads multithreads;

		 B(multithreads multithreads){
  			 this.multithreads = multithreads;
		 } 
		@Override public void run(){
	String [] alpha =new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; 
	try {	
		synchronized(multithreads) { 
			for (int i = 0; i < 7; i++) { 
				while(multithreads.status%4!=1){
                	   		multithreads.wait();
	               		}    
  		
		//System.out.println(counter.get());
		System.out.println(Thread.currentThread().getName() +alpha[multithreads.status]); 
		//System.out.println(
		//counter.getAndIncrement(); 
		
		
	
	  multithreads.status ++;
               multithreads.notifyAll();
	}
	}
	}catch (InterruptedException ie )
	{ System.out.println("Child HEREthread interrupted! " + ie); 
	} 
}

	
}
class C extends Thread{	
	 multithreads multithreads;

		 C(multithreads multithreads){
  			 this.multithreads = multithreads;
		 } 
		@Override public void run(){
	String [] alpha =new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; 
	try {	
		synchronized(multithreads) {for (int i = 0; i < 6; i++) { 
			
			while(multithreads.status%4!=2){
                	   multithreads.wait();
               		}
		      	
		//System.out.println(counter.get());
		System.out.println(Thread.currentThread().getName() +alpha[multithreads.status]); 
		//System.out.println(
		//counter.getAndIncrement(); 
		
		
	
	  multithreads.status ++;
               multithreads.notifyAll();
	
	}
	}
	}catch (InterruptedException ie )
	{ System.out.println("Child HEREthread interrupted! " + ie); 
	} 
}

	
}
class D extends Thread{	
	 multithreads multithreads;

	D(multithreads multithreads){
 		 this.multithreads = multithreads;
	 } 
	@Override public void run(){
	String [] alpha =new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"}; 
	try {	
		synchronized(multithreads) {
			for (int i = 0; i < 6; i++) { 
		
			while(multithreads.status%4!=3){
                	   multithreads.wait();
               }      	
		//System.out.println(counter.get());
		System.out.println(Thread.currentThread().getName() +alpha[multithreads.status]); 
		//System.out.println(
		//counter.getAndIncrement(); 
		
	
	
	  multithreads.status ++;
               multithreads.notifyAll();
	}
	}
	}catch (InterruptedException ie )
	{ System.out.println("Child HEREthread interrupted! " + ie); 
	} 
}

	
}
