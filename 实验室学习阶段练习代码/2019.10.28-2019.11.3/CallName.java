import java.util.Random;
public class CallName{
	public static void main(String[] args){
		 String[] name = {"��","��","��","��"};
		 for (String x : name){
			 System.out.println(x);
		 }
		System.out.println("����Ϊ================================================");
		Random ran = new Random();
		int num = ran.nextInt(name.length);
	    System.out.println(name[num]);
	} 
	
}