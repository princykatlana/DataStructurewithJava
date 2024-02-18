package DataStructure;

/*
 * Implemented Stack with Linked List
 * 1) Push operation
 * 2) Pop operation
 */
public class StackWithLinkedList {
	
	static Node head;
	static int maxsize=5;
	static int count = 0;
	
	
	public static void push(int data) {
		
		if(count == maxsize) {
			System.out.println("stack is full!");
		}else {
			
			Node n = head;
			
			// creating new node.
			Node newNode = new Node();
			newNode.data = data; 
			newNode.next = n; 
			
			head = newNode;
			count++;

		}
	}
	
	
	public static void pop() {
		if(count == 0) {
			System.out.println("stack is Empty!");
		}else {		
			head = head.next;;
		}

	}	
	
	public static void show() {
		if(count == 0) {
			System.out.println("stack is Empty!");
		}else {
			Node node = head;
			while(node.next!=null) {
				System.out.println(node.data);
				node = node.next;
			}
			System.out.println(node.data);
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
