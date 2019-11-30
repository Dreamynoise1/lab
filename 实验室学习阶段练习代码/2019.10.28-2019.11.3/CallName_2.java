import java.util.ArrayList;
import java.util.Random;
public class CallName{
	public static void main(String[] args){
	ArrayList<Student> student = new ArrayList<Student>();
	add(student);
	printStudent(student);
	randomStudent(student);
	}	
	/*创建一个方法 把所有的学生数据（姓名，年龄）
	保存到student集合里
	*/
	public static void add(ArrayList<Student> student){
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
	    Student st4 = new Student();
		Student st5 = new Student();
		st1.name = "张三";
		st1.age = 3;
		
		st2.name = "李四";
		st5.age = 543;
		
		st3.name = "王五";
		st3.age = 35;
		
		st4.name = "赵六";
		st4.age = 345;
		
		st5.name = "孙二十六";
		st5.age = 56;
		
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.add(st4);
		student.add(st5);
    }
	/*创建一个方法 遍历集合并打印*/
	public static void printStudent(ArrayList<Student> student){
     for(int i = 0; i < student.size();i++){
		Student st = student.get(i);
		System.out.println(st.name  +"   "+  st.age);
	 }
	}
	
	/*创建一个方法 随机打印一个学生信息*/
	public static void randomStudent(ArrayList<Student> student){
		Random ran = new Random();
		int index = ran.nextInt(student.size());
		Student st = student.get(index);
	    System.out.println(st.name + " "+st.age);
	}
}