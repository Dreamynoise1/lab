package tywang;

public class Pc {
   public static void main(String[] args) {
	   PcTurnOn();
	   //UsbInterface usb= new ShuBiao();
	   useUsb(new ShuBiao());
	   PcTurnOff();
	  
}
  
public static void PcTurnOn() {
	   System.out.println("电脑开启");
   }
   public static void PcTurnOff() {
	   System.out.println("电脑关闭");
   }
   public static void useUsb(UsbInterface usb) {
	  usb.TurnOn();
   }
}
