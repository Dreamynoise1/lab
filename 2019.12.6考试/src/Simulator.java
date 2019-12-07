
public class Simulator {
	 public void playSound(Animal animal) {        
		 System.out.print("现在播放"+animal.getAnimalName()+"类的声 音:");        
		 animal.cry();    
		 } 
	 public void playFly(Fly flyAnimal) {        
		 System.out.print("飞行功能演示");        
		 flyAnimal.fly();    
		 } 
}
