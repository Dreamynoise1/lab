public class HalfSearch{
	public static void main(String[] args){
	int[] a = {1,3,5,7,9,11,13}	;
	int i = 9;
	int num = half(a,i);
	System.out.println(num);
	}
	public static int half(int[] a,int number){
		int min = 0;
		int max = a.length-1;
		int mid = 0;
		while(min<=max){
			mid = (min+max)/2;
			if(number < a[mid]){
				max=mid-1;
			}else if(number >a[mid]){
				min=mid+1;
			}else if(number == a[mid]){
				return mid;
			}
		}
	    return -1;
	}
}
