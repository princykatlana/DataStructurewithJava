package DataStructure;

/*
 * This class contain all basic operations on array
 * 1) Traversal 
 * 2) Insertion
 * 3) Deletion
 * 4) search
 * 5) update 
 */
public class Array {
	
	
	// **Traversal of array**
	public static void traverse(int[] arr) {
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//**Insert value in array**
	public static int[] insertValue(int[] arr, int value, int index) {
		
		int[] newarr = new int[arr.length+1];
		for(int i=arr.length-1 ; i>= index; i--) {	
			newarr[i+1]=arr[i];
		}
		newarr[index]=value;
		for(int i=0 ; i<index; i++) {	
			newarr[i]=arr[i];
		}
		return newarr;
	}
	
	//**delete value in array**
	private static int[] deleteValue(int[] arr, int value) {
		int len = arr.length;
		int[] newarr = new int[len-1];
		int pos=0;
		
		for(int i=0 ; i<len-1; i++) {	
			if(arr[i]==value) {
				newarr[i]= arr[i+1];
				pos=i+1;
				break;
			}else {
				newarr[i]= arr[i];
			}
		}
		if(pos < len) {
			
			for(int i=pos+1 ; i<len; i++) {
				newarr[i-1]= arr[i];
			}
		}
	
		return newarr;
	}
	
	//**Search value in array**
	private static String searchValue(int[] arr, int value) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i]== value)
				return ("Value is present in array at Index : " + i );
		}
		return ("Value is not present in given array");
	}

	
	public static void main(String[] args) {
		
		int[] arr = {18, 30, 15, 70, 12};  
		 
		// Traversal 
		traverse(arr);   // output: {18, 30, 15, 70, 12}
		
		// Insertion
		traverse(insertValue(arr, 24, 2));   // output: 18 30 24 15 70 12 
		
		//deletion
		traverse(deleteValue(arr, 30));   // output: 18 15 70 12 
		
		//search 
		System.out.println(searchValue(arr, 15));  // output: Value is present in array at Index : 2
		
	}




}
