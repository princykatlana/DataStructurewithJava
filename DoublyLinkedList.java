package DataStructure;


public class DoublyLinkedList {
	
	static DoublyNode head;
	
	//insert value in end
	 public static void insert(int data) {
		 
		 // creating Node
		 DoublyNode  node = new DoublyNode();
		 node.data = data;
		 node.prev = null;
		 node.next = null;
		 
		if(head == null) {
			head = node;
		}else {
			DoublyNode n= head;
			
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
			node.prev = n;
		}
	}
	 
	 //insert given value at first index
	 public static void insertAtStart(int data) {
		 
		 // creating Node
		 DoublyNode  node = new DoublyNode();
		 node.data = data;
		 node.prev = null;
		 node.next = null;
		 
		 DoublyNode first = head;	
		 
		 node.next= first;
		 first.prev=node;
		 head= node;
		 
	}
	 
	 //insert given value at given index 
	 public static void insertAt(int data, int index) {
		 
		 // creating Node
		 DoublyNode  node = new DoublyNode();
		 node.data = data;
		 node.prev = null;
		 node.next = null;
		 
		 DoublyNode n = head;	
		 
		 if (index == 0) {
			 insertAtStart(data);
		 } else {	
			 for (int i=0; i<index-1 ; i++) {
				 n=n.next;				
			 }
			 
			 DoublyNode nextNode = n.next;
			
			 node.next= nextNode;
			 nextNode.prev = node;
			 n.next=node;
			 node.prev=n;
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
		insert(6);
		show();
		
		System.out.println(" inserting at first place");
		insertAtStart(1);
		show();
		
		System.out.println(" inserting at index 3");
		insertAt(4,2);
		show();
		
	}

	
}
