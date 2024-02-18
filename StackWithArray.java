package DataStructure;

/*
 * Implemented Stack with Array
 * 1) Push operation
 * 2) Pop operation
 * 3) IsEmpty 
 * 4) IsFull
 */
public class StackWithArray {
	
	static int top;
	static int maxsize = 10;
	static int[] stack = new int[maxsize];
	
	public static void push(int data) {
		if (top == maxsize) 
			System.out.println("stack is full");
		else
			stack[top++]= data;
	}
	
	
	public static void pop() {
		if (top == 0) {
			System.out.println("stack is empty");
		}
		top--;
	}
	
	public static boolean isEmpty() {
		if (top == 0) {
			System.out.println("stack is empty");
			return true;
		}
		return false;
	}
	
	public static boolean isFull() {
		if (top == maxsize) {
			System.out.println("stack is Full");
			return true;
		}
		return false;
	}
	
	
	public static void show() {
		
		if(top == 0)
			System.out.println("Stack is empty");
		else {
			for(int i=top-1; i>=0; i--) {
				System.out.println(stack[i]);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Hello To stak operations: ");
		
		push(12);
		push(23);
		push(42);
		push(50);
		
		System.out.println("Stack entries: ");
		show();
		
		
		System.out.println("after pop operation: ");
		pop();
		show();
		
		
	}

}
