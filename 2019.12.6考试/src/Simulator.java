
public class Simulator {
	 public void playSound(Animal animal) {        
		 System.out.print("���ڲ���"+animal.getAnimalName()+"����� ��:");        
		 animal.cry();    
		 } 
	 public void playFly(Fly flyAnimal) {        
		 System.out.print("���й�����ʾ");        
		 flyAnimal.fly();    
		 } 
}
