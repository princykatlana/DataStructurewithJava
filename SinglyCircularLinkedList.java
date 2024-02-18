package DataStructure;

public class SinglyCircularLinkedList {
	
	static Node head;
	
	public static void insert(int data) {
			
		// creating new node.
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head = node;
			node.next=head;
		}else {
			Node n = head;
			while(n.next!=head) {
				n = n.next;
			}
			n.next=node;
			node.next=head;
		}
	}
	

	private static void insertAtStart(int data) {
		
		Node first = head;
		
		// creating new node.
		Node newNode = new Node();
		newNode.data=data;
		newNode.next=null;
		
		head = newNode;
		newNode.next=first;
		
	}
	
			// adding value at given index.
			public static void insertAt(int data, int index) {
				
				// creating new node.
				Node node = new Node();
				node.data=data;
				node.next=null;
				
				if(index == 0)
					insertAtStart(data);
				else {
					Node n= head;
					
					for(int i =0; i<index-1; i++) {
						n=n.next;
					}
					node.next=n.next;
					n.next=node;
				}
			}
			
			
			//to delete given value
			private static void delete(int data) {
				Node n= head;
				Node j= head;
				
				Node temp = null;
				int index=0;
				while(n.next!=null) {
					if(n.data==data) {
						temp=n;
						break;
					}
					n=n.next;
					index++;
				}
			
				for(int i=0; i<index-1; i++) {
					j=j.next;
				}
				j.next = temp.next;
			}
			
			
			
	//To show complete linked list.
	public static void show() {
		Node node = head;
		while(node.next!=head) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	

	public static void main(String[] args) {
		
		SinglyCircularLinkedList list = new SinglyCircularLinkedList();
		list.insert(2);
		list.insert(4);	
		list.insert(8);	
		list.show();
		
		System.out.println(" adding value at start");
		//insertAtStart(3);
		show();
		
		System.out.println(" adding at index ");
		insertAt(1,2);
		show();
		
		System.out.println(" deleting the value");
		delete(1);
		show();
		
	}


}
