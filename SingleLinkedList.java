package DataStructure;

//1) insert the value in end
//2) Insert the value in start
//3) insert the value in middle
//4) Show complete linked list
//5) delete the value from linked list

public class SingleLinkedList {
	
	static Node head;
	
	public static void insert(int data) {
			
		// creating new node.
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head = node;
		}else {
			Node n= head;
			while(n.next!=null) {
				n = n.next;
			}
			
			n.next=node;
		}
	}
	
	// adding value at start.
	public static void insertatStart(int data) {
		
		Node n = head; 
		
		// creating new node.
		Node node = new Node();
		node.data=data;
		node.next=n;
		
		head=node;
		
	}
	
	
	// adding value at given index.
		public static void insertat(int data, int index) {
			
			// creating new node.
			Node node = new Node();
			node.data=data;
			node.next=null;
			
			if(index == 0)
				insertatStart(data);
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
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public static void main(String[] args) {
		
		
		SingleLinkedList list = new SingleLinkedList();
		list.insert(2);
		list.insert(4);
		list.insert(14);
		list.insert(30);		
		list.show();
		
		System.out.println(" adding value at start");
		insertatStart(3);
		show();
		
		System.out.println(" adding at index ");
		insertat(1,2);
		show();
		
		System.out.println(" deleting the value");
		delete(14);
		show();
		
	}



}
