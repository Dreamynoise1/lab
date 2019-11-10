public class Method{
	public static void main(String[] args){
		int a = 1;
		int b = 2;
		change(a,b);
		System.out.println(change(a,b));
	}
	public static int change(int a, int b){
		a = a + b;
		return a;
	}
}