
public class Timer {

public static void main(String args[]){
	
	
	for (int count =0;count<10;count++){
		System.out.println("Timeout");
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			
			e.printStackTrace();
		}
		}
	}
}
