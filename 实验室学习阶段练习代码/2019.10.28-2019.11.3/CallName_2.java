import java.util.ArrayList;
import java.util.Random;
public class CallName{
	public static void main(String[] args){
	ArrayList<Student> student = new ArrayList<Student>();
	add(student);
	printStudent(student);
	randomStudent(student);
	}	
	/*����һ������ �����е�ѧ�����ݣ����������䣩
	���浽student������
	*/
	public static void add(ArrayList<Student> student){
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
	    Student st4 = new Student();
		Student st5 = new Student();
		st1.name = "����";
		st1.age = 3;
		
		st2.name = "����";
		st5.age = 543;
		
		st3.name = "����";
		st3.age = 35;
		
		st4.name = "����";
		st4.age = 345;
		
		st5.name = "���ʮ��";
		st5.age = 56;
		
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.add(st4);
		student.add(st5);
    }
	/*����һ������ �������ϲ���ӡ*/
	public static void printStudent(ArrayList<Student> student){
     for(int i = 0; i < student.size();i++){
		Student st = student.get(i);
		System.out.println(st.name  +"   "+  st.age);
	 }
	}
	
	/*����һ������ �����ӡһ��ѧ����Ϣ*/
	public static void randomStudent(ArrayList<Student> student){
		Random ran = new Random();
		int index = ran.nextInt(student.size());
		Student st = student.get(index);
	    System.out.println(st.name + " "+st.age);
	}
}