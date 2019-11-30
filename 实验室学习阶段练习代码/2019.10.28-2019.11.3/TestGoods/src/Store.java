import java.util.ArrayList;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) throws Exception {
      ArrayList<Goods> GoodsList = new ArrayList<Goods>();
      addBaseGoods(GoodsList);
 
      while(true) {
      int i = chooseFunction();
      switch(i) {
      case 1://军火清单
    	  showGoodsList(GoodsList);
    	  backMainMune();
    	  break;
      
      case 2://添加军火 
    	  addGoods(GoodsList);
    	  backMainMune();
    	  break;
      
      case 3://删除军火
    	  deletGoods(GoodsList);
    	  backMainMune();
    	  break;
      
      case 4://修改军火数
    	  updateGoods(GoodsList);
    	  backMainMune();
    	  break;
      
      case 5://退出
    	  return;
    	    	  
	  default : 
		  System.out.println("功能编号不存在，请重新输入"); 
	      chooseFunction();
	      }
      }
      

	}
	/*创建一个方法 上架商品*/
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
	/*将商品显示出来*/
	public static void showGoodsList(ArrayList<Goods> GoodsList) {
		System.out.println();
		System.out.println("====================军火库====================");
		System.out.println("商品编号         商品名称         商品单价         商品数");
		for(Goods Goods : GoodsList) {
		System.out.println("   "+Goods.ID+"         "+Goods.name+"    "+Goods.price+"         "+Goods.count);
		}
		}
	public static void mainMenu() {
		System.out.println();
		System.out.println("============欢迎光临社会主义保家卫国级供货商店============");
		System.out.println("1: 军火清单   2: 添加军火   3: 删除军火   4: 修改上架军火信息    5: 退出");
		
	}
	public static void addGoods(ArrayList<Goods> GoodsList) {
		System.out.println("你已选择添加军火功能");
	    Scanner scId = new Scanner(System.in);
		System.out.println("请输入军火编号");
	    int id =  scId.nextInt();
	    
	    Scanner scName = new Scanner(System.in);
		System.out.println("请输入军火名");
		String name = scName.next();
		
		Scanner scPrice = new Scanner(System.in);
		System.out.println("输入单价");
		double price = scPrice.nextDouble();
		
		Scanner scCount = new Scanner(System.in);
		System.out.println("输入该军火进货数");
		int count = scCount.nextInt();
		
		/*创建一个Goods类型的变量用于保存输入的数据*/
		Goods Goods = new Goods();
		Goods.ID = id;
		Goods.name = name;
		Goods.price = price;
		Goods.count = count;
		GoodsList.add(Goods);
		System.out.println("军火成功上架");
	}
	public static int chooseFunction() throws Exception{
	    mainMenu();
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入要操作的功能序号");
		int i =sc.nextInt();
		return i;
	}
	


	public static void backMainMune() {
	  Scanner sc1 = new Scanner(System.in);
	  System.out.println("输入back按下回车返回上一层");
	  String sc = sc1.next();
	  if (sc.equals("back")) {
	  }else {
		  backMainMune();
	  }
	}
	public static void deletGoods(ArrayList<Goods> GoodsList) {
		System.out.println("你已选择删除军火功能");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入想要删除的军火编号");
		int id = sc.nextInt();
		for (int i = 0; i < GoodsList.size(); i++) {
			Goods Goods = GoodsList.get(i);
			if (Goods.ID == id) {
				GoodsList.remove(i);
				System.out.println("军火  "+Goods.name+" 余量  "+Goods.count+"  已移除");
				return;
			}
		}
		System.out.println("无该军火");
	}
	public static void updateGoods(ArrayList<Goods> GoodsList) {
		System.out.println("你已选择修改功能");
		System.out.println("请输入商品的编号");
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		for (Goods Good :GoodsList) {
			if (Good.ID == ID) {
				System.out.println("输入新军火编号   原编号为"+Good.ID);
				Good.ID = sc.nextInt();

				System.out.println("输入新军火名   原军火名为"+Good.name);
				Good.name = sc.next();

				System.out.println("输入新价格   原价格为"+Good.price);
				Good.price = sc.nextDouble();
				
				System.out.println("输入新数量   原数量为"+Good.count);
				Good.count = sc.nextInt();
				
				System.out.println("军火已修改");
				System.out.println("商品编号  商品名称  商品单价  商品数");
				System.out.println(" "+Good.ID+"  "+Good.name+"  "+Good.price+"  "+Good.count);
				return;
		}
		System.out.println("输入的编号不存在");
	}

	}
	}


	
