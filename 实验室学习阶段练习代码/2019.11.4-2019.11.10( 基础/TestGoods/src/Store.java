import java.util.ArrayList;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) throws Exception {
      ArrayList<Goods> GoodsList = new ArrayList<Goods>();
      addBaseGoods(GoodsList);
 
      while(true) {
      int i = chooseFunction();
      switch(i) {
      case 1://�����嵥
    	  showGoodsList(GoodsList);
    	  backMainMune();
    	  break;
      
      case 2://��Ӿ��� 
    	  addGoods(GoodsList);
    	  backMainMune();
    	  break;
      
      case 3://ɾ������
    	  deletGoods(GoodsList);
    	  backMainMune();
    	  break;
      
      case 4://�޸ľ�����
    	  updateGoods(GoodsList);
    	  backMainMune();
    	  break;
      
      case 5://�˳�
    	  return;
    	    	  
	  default : 
		  System.out.println("���ܱ�Ų����ڣ�����������"); 
	      chooseFunction();
	      }
      }
      

	}
	/*����һ������ �ϼ���Ʒ*/
	public static void addBaseGoods(ArrayList<Goods> GoodsList) {
		Goods Goods1 = new Goods();
		Goods1.ID = 01;
		Goods1.name = "m4a1     ";
		Goods1.count = 1;
		Goods1.price = 3100;
		Goods1.money = Goods1.price * Goods1.count;
		
		Goods Goods2 = new Goods();
		Goods2.ID = 02;
		Goods2.name = "ak47     ";
		Goods2.count = 3;
		Goods2.price = 2700;
		Goods2.money = Goods2.price * Goods2.count;
		
		Goods Goods3 = new Goods();
		Goods3.ID = 03;
		Goods3.name = "awp      ";
		Goods3.count = 1;
		Goods3.price = 4750;
		Goods3.money = Goods3.price * Goods3.count;
		
		Goods Goods4 = new Goods();
		Goods4.ID = 04;
		Goods4.name = "flashBoom";
		Goods4.count = 10;
		Goods4.price = 200;
		Goods4.money = Goods4.price * Goods4.count;
		
		GoodsList.add(Goods1);
		GoodsList.add(Goods2);
		GoodsList.add(Goods3);
		GoodsList.add(Goods4);
		
		
		}
	/*����Ʒ��ʾ����*/
	public static void showGoodsList(ArrayList<Goods> GoodsList) {
		System.out.println();
		System.out.println("====================�����====================");
		System.out.println("��Ʒ���         ��Ʒ����         ��Ʒ����         ��Ʒ��");
		for(Goods Goods : GoodsList) {
		System.out.println("   "+Goods.ID+"         "+Goods.name+"    "+Goods.price+"         "+Goods.count);
		}
		}
	public static void mainMenu() {
		System.out.println();
		System.out.println("============��ӭ����������屣�������������̵�============");
		System.out.println("1: �����嵥   2: ��Ӿ���   3: ɾ������   4: �޸��ϼܾ�����Ϣ    5: �˳�");
		
	}
	public static void addGoods(ArrayList<Goods> GoodsList) {
		System.out.println("����ѡ����Ӿ�����");
	    Scanner scId = new Scanner(System.in);
		System.out.println("�����������");
	    int id =  scId.nextInt();
	    
	    Scanner scName = new Scanner(System.in);
		System.out.println("�����������");
		String name = scName.next();
		
		Scanner scPrice = new Scanner(System.in);
		System.out.println("���뵥��");
		double price = scPrice.nextDouble();
		
		Scanner scCount = new Scanner(System.in);
		System.out.println("����þ��������");
		int count = scCount.nextInt();
		
		/*����һ��Goods���͵ı������ڱ������������*/
		Goods Goods = new Goods();
		Goods.ID = id;
		Goods.name = name;
		Goods.price = price;
		Goods.count = count;
		GoodsList.add(Goods);
		System.out.println("����ɹ��ϼ�");
	}
	public static int chooseFunction() throws Exception{
	    mainMenu();
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�����Ĺ������");
		int i =sc.nextInt();
		return i;
	}
	


	public static void backMainMune() {
	  Scanner sc1 = new Scanner(System.in);
	  System.out.println("����back���»س�������һ��");
	  String sc = sc1.next();
	  if (sc.equals("back")) {
	  }else {
		  backMainMune();
	  }
	}
	public static void deletGoods(ArrayList<Goods> GoodsList) {
		System.out.println("����ѡ��ɾ��������");
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ���ľ�����");
		int id = sc.nextInt();
		for (int i = 0; i < GoodsList.size(); i++) {
			Goods Goods = GoodsList.get(i);
			if (Goods.ID == id) {
				GoodsList.remove(i);
				System.out.println("����  "+Goods.name+" ����  "+Goods.count+"  ���Ƴ�");
				return;
			}
		}
		System.out.println("�޸þ���");
	}
	public static void updateGoods(ArrayList<Goods> GoodsList) {
		System.out.println("����ѡ���޸Ĺ���");
		System.out.println("��������Ʒ�ı��");
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		for (Goods Good :GoodsList) {
			if (Good.ID == ID) {
				System.out.println("�����¾�����   ԭ���Ϊ"+Good.ID);
				Good.ID = sc.nextInt();

				System.out.println("�����¾�����   ԭ������Ϊ"+Good.name);
				Good.name = sc.next();

				System.out.println("�����¼۸�   ԭ�۸�Ϊ"+Good.price);
				Good.price = sc.nextDouble();
				
				System.out.println("����������   ԭ����Ϊ"+Good.count);
				Good.count = sc.nextInt();
				
				System.out.println("�������޸�");
				System.out.println("��Ʒ���  ��Ʒ����  ��Ʒ����  ��Ʒ��");
				System.out.println(" "+Good.ID+"  "+Good.name+"  "+Good.price+"  "+Good.count);
				return;
		}
		System.out.println("����ı�Ų�����");
	}

	}
	}


	
