import java.util.Random;
import java.util.Scanner;
public class GuestNub{
	public static void main (String[] args){
		System.out.println("������1-100");
		Random ran = new Random();
		 int rannub = ran.nextInt(100) + 1;
		
		while(true){
			Scanner sca = new Scanner(System.in);
			   int scanub = sca.nextInt();
			   if(scanub > rannub){
				   System.out.println("�´���");
		
			   }else if(scanub < rannub){
				   System.out.println("��С��");
				   
			   }else{
				   System.out.println("�¶���");
				   break;
			   }
			
			
		}
		
		
		
	}
	
	
	
	
	
}