package DataStructure;

public class DoublyCircularLinkedList {
	
	static DoublyNode head;
	
	//insert value in end
		 public static void insert(int data) {
			 
			 // creating Node
			 DoublyNode  node = new DoublyNode();
			 node.data = data;
			 node.prev = null;
			 node.next = null;
			 
			 DoublyNode temp = head;
			 
			if(head == null) {
				head = node;
				node.next = temp;
			}else {
				 DoublyNode n = head;
				 
				while(n.next!=head) {
					n=n.next;
				}
				n.next=node;
				node.next=head;
				node.prev = n;
			}
		}
		 

	//To show complete linked list.
	public static void show() {
		DoublyNode node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public static void main(String[] args) {
		
		insert(2);
		insert(3);
		show();
		
//		System.out.println(" inserting at first place");
//		insertAtStart(1);
//		show();
//		
//		System.out.println(" inserting at index 3");
//		insertAt(4,2);
//		show();
		
	}

}
