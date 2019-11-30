import java.util.Random;
public class CallName{
	public static void main(String[] args){
		 String[] name = {"周","秦","汉","晋"};
		 for (String x : name){
			 System.out.println(x);
		 }
		System.out.println("点名为================================================");
		Random ran = new Random();
		int num = ran.nextInt(name.length);
	    System.out.println(name[num]);
	} 
	
}