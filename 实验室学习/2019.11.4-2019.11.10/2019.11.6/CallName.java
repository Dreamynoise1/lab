import java.util.Random;
public class CallName{
	public static void main(String[] args){
		String[] names = new String[8];
		addNames(names);
		printName(names);
		//System.out.println(names[randomName(names)]);
	}
	public static void addNames(String[] names){
		names[0] = "����";
		names[1] = "����";
		names[2] = "����";
		names[3] = "����";
		names[4] = "��÷÷";
		names[5] = "С��";
		names[6] = "����";
		names[7] = "С��";
	}
	public static void printName(String[] names){
		for(String x : names){
			System.out.println(x);
			
		}
		
	}
	public static int randomName(String[] names){
		Random ran = new Random();
		
		return ran.nextInt(names.length);
	}
}