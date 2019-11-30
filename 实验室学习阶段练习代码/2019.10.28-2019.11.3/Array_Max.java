public class Array_Max{
public static void main(String[] args){
	int[] arr = {1999,8,15};
	int num = arr[0];
	for (int x : arr){
		if (num < x){
			num = x;
		}
	}
System.out.println(num);}}