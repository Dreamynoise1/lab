package tywang;

public class Pc {
   public static void main(String[] args) {
	   PcTurnOn();
	   //UsbInterface usb= new ShuBiao();
	   useUsb(new ShuBiao());
	   PcTurnOff();
	  
}
  
public static void PcTurnOn() {
	   System.out.println("���Կ���");
   }
   public static void PcTurnOff() {
	   System.out.println("���Թر�");
   }
   public static void useUsb(UsbInterface usb) {
	  usb.TurnOn();
   }
}
