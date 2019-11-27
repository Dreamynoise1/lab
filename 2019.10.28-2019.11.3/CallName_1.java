import java.util.Random;
public class CallName{
	public static void main(String[] args){
		String[] names = new String[8];
		addNames(names);
		printName(names);
		//System.out.println(names[randomName(names)]);
	}
	public static void addNames(String[] names){
		names[0] = "张三";
		names[1] = "李四";
		names[2] = "王五";
		names[3] = "李蕾";
		names[4] = "韩梅梅";
		names[5] = "小名";
		names[6] = "老王";
		names[7] = "小华";
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