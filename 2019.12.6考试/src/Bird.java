
public class Bird extends Animal implements Fly{

	@Override
	public void fly() {
		System.out.println("fei");
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void cry() {
		System.out.println("ku");
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public String getAnimalName() {
		// TODO �Զ����ɵķ������
		return this.aname;
	}

}
