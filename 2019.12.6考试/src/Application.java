
public class Application {
public static void main(String[] args) {
	Simulator simu = new Simulator();
	Bird bird =new Bird();
	bird.setName("������");
	simu.playSound(bird);
	simu.playFly(bird);
	
}
}
