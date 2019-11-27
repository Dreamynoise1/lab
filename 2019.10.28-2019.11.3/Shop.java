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
			return;//结束main方法
			
			default:
			System.out.println("无功能");
		}
		
		}

	}
	public static void update(String[] brand,int[] count){
		for(int i = 0;i < brand.length;i++){
			System.out.println("请输入"+brand[i]+"的库存数");
			Scanner scanner = new Scanner(System.in);
			int newcount = scanner.nextInt();
			count[i] = newcount;
		}
		
	}
	public static void printStore(String[] brand,double[] size,double[] price,int[] count){
		System.out.println("----------商场库存清单----------");
		System.out.println("品牌型号     尺寸    价格    库存数");
        int totalCount = 0;
		double totalMoney = 0;
		for(int i = 0 ; i < brand.length;i++){
		 System.out.println(brand[i]+"   "+size[i]+"    "+price[i]+"   "+count[i]);
		 totalCount = totalCount + count[i];
		 totalMoney = totalMoney + price[i];
		}
		System.out.println("总库存数: "+totalCount);
		System.out.println("商品库存总金额: "+totalMoney);

	}
	public static int chooseFunction(){
		System.out.println("-------------库存管理------------");
		System.out.println("1.查看库存清单");
		System.out.println("2.修改商品库存数量");
		System.out.println("3.退出");
		System.out.println("请输入要执行的操作序号：");
		Scanner scanner = new Scanner(System.in);
		int choose = scanner.nextInt();
		return choose;
	}

}
