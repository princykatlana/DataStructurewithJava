package DataStructure;

public class BinarySearch {
	
	static int pos = -1;
	
	public static void find( int[] arr, int data, int start, int last) {
		

		int mid =  last + start / 2;
				
		if(arr[mid] == data) {
			pos = mid;
		}
		else {
			if(arr[mid] < data) {
				start = mid+1;
				find(arr, data, start, mid);
			}else {
				last = mid-1;
				find(arr, data, start, last);
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {10,12,35,46,78,90};
		
		int val= 78;
		int size = arr.length -1;
		int start = 0;
		int last = size;
		
		find(arr, val, start, last);
		System.out.println(pos);
	}

}
