import java.util.Scanner;
public class Shop{
	public static void main(String[] args){
		String[] brand = {"MacBookAir","ThinkpadT450"};
		double[] size = {13.3,15.6};
		double[] price = {9998.97,6789.56};
		int[] count = {0,0};
		
		while(true){
			int choose = chooseFunction();
		switch(choose){
			case 1:
			 printStore(brand,size,price,count);
			 break;
			case 2:
			update(brand,count);
			break;
			case 3:
			return;//����main����
			
			default:
			System.out.println("�޹���");
		}
		
		}

	}
	public static void update(String[] brand,int[] count){
		for(int i = 0;i < brand.length;i++){
			System.out.println("������"+brand[i]+"�Ŀ����");
			Scanner scanner = new Scanner(System.in);
			int newcount = scanner.nextInt();
			count[i] = newcount;
		}
		
	}
	public static void printStore(String[] brand,double[] size,double[] price,int[] count){
		System.out.println("----------�̳�����嵥----------");
		System.out.println("Ʒ���ͺ�     �ߴ�    �۸�    �����");
        int totalCount = 0;
		double totalMoney = 0;
		for(int i = 0 ; i < brand.length;i++){
		 System.out.println(brand[i]+"   "+size[i]+"    "+price[i]+"   "+count[i]);
		 totalCount = totalCount + count[i];
		 totalMoney = totalMoney + price[i];
		}
		System.out.println("�ܿ����: "+totalCount);
		System.out.println("��Ʒ����ܽ��: "+totalMoney);

	}
	public static int chooseFunction(){
		System.out.println("-------------������------------");
		System.out.println("1.�鿴����嵥");
		System.out.println("2.�޸���Ʒ�������");
		System.out.println("3.�˳�");
		System.out.println("������Ҫִ�еĲ�����ţ�");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		return choose;
	}

}
