import java.util.Random;
import java.util.Scanner;
public class GuestNub{
	public static void main (String[] args){
		System.out.println("猜数字1-100");
		Random ran = new Random();
		 int rannub = ran.nextInt(100) + 1;
		
		while(true){
			Scanner sca = new Scanner(System.in);
			   int scanub = sca.nextInt();
			   if(scanub > rannub){
				   System.out.println("猜大了");
		
			   }else if(scanub < rannub){
				   System.out.println("猜小了");
				   
			   }else{
				   System.out.println("猜对了");
				   break;
			   }
			
			
		}
		
		
		
	}
	
	
	
	
	
}