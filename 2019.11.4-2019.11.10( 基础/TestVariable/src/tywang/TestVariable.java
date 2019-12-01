package tywang;
/* 测试成员变量的生命周期
 * 
 */
public class TestVariable {
	public static void main(String[] args) {
	for(int i = 0 ; i< 10;i++) {	
	}
	int i = 54;//可再次定义一个i 因为上一个局部变量i生命周期只在for中；
	System.out.println(i);
	int b = 0;
	//int b = 0; 该语句报错 局部变量b的生命周期为main方法
	}
}
