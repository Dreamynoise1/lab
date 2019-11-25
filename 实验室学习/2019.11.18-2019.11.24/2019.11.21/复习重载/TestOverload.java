public class TestOverload{
	public static void main(String[] args){
		
		System.out.println(addnumb(5,6.0));
	}
	/*public static String addnumb(String a,String b,String c){
		return a+b+c;
	}
	*/
	public static double addnumb(double a ,double b){
		return a+b;
	}
	public static int addnumb(int a,int b){
		return a+b;
	}
	/*public static double addnumb(double a,double b,int c){
		return a+b+c;
	}
	public static String addnumb(int a,int b, String c){
	    return a+b+c;
	}*/
	
}