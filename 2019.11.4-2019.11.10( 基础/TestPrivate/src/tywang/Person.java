package tywang;

public class Person {
     private  int age = 20 ;
     private String name;
     public int count;
   public static void main(String[] args) {
	   int a = 10;
	   Person p = new Person();
	  // int b = p.setAge(a);
	   p.setAge(a);
	   System.out.println(p.age);

	
}
   public void setAge(int a ) {
	   age = a;
   }
   public void getAge(String str) {
	   name = str;
   }
}
