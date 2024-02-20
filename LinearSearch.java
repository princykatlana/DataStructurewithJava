package DataStructure;

public class LinearSearch {
	
	public static int find( int[] arr, int data) {
		
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]== data) {
				pos=i;
				break;
			}
		}
		
		return pos;
	}
	
	public static void main(String[] args) {
		int[] arr = {12,23,45,76,24,87,10};
		System.out.println(find(arr, 13));
	}

}
