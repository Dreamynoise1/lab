
public class Application {
public static void main(String[] args) {
	Simulator simu = new Simulator();
	Bird bird =new Bird();
	bird.setName("²¼¹ÈÄñ");
	simu.playSound(bird);
	simu.playFly(bird);
	
}
}
