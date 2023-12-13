




class Multi extends Thread{  
public void run(){  
System.out.println("thread 1 is running...");  
		}  
 
}  

class multi2 extends Thread{
	
	
	public void run() {
		System.out.println("Thread 2 is running....");
	}
}







public class Threadclass {

	public static void main(String[] args) {
	
		try {
		Multi t1=new Multi();  
		multi2 t2 = new multi2();
		
		t1.start();  
		t2.start();
		
		}
		catch (Exception e ) {System.out.println("Exception occured...");}
	}

}
