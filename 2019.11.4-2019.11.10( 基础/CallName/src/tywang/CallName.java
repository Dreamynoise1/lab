package tywang;

import java.util.ArrayList;
import java.util.Random;

public class CallName {

	public static void main(String[] args) {
		ArrayList<Student> StudentList = new ArrayList<Student>();
		add(StudentList);
		print(StudentList);
		random(StudentList);
		
		
		

	}
    public static void add(ArrayList<Student> StudentList) {
    	Student s1 = new Student();
    	s1.setAge(18);
    	s1.setName("wty1");
    	
    	Student s2 = new Student();
    	s2.setAge(20);
    	s2.setName("wty2");
    	
    	Student s3 = new Student();
    	s3.setAge(22);
    	s3.setName("wty3");
    	
    	StudentList.add(s1);
    	StudentList.add(s2);
    	StudentList.add(s3);
    }
    
    public static void print(ArrayList<Student> StudentList) {
    	for(Student student:StudentList) {
    		System.out.println(student.getAge()+student.getName());
    	}
    }
    
    public static void random(ArrayList<Student> StudentList) {
    	Random ran = new Random();
    	int i = ran.nextInt(StudentList.size());
    	System.out.println(StudentList.get(i).getName());
    }
}
