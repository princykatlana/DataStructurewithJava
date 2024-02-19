package DataStructure;

public class CircularQueue {
	
	int size = 5;
	int[] queue = new int[size];
	int front = -1;
	int rear = -1 ; 
	
	private boolean isEmpty() {
		
		if ((front == -1 && rear == -1) || 
			(front == 0 && rear != size-1) ||
			(front > 0 && rear < front && rear != front-1)) {
			return true;
		}
		return false;
	}
	
	private boolean isFull() {
		if ((front == 0 && rear == size-1) || 
			(front > 0 && rear == (front - 1))) {
			return true;
		}
		return false;
	}
	
	private void enqueue(int data) {
		
		if (isFull())
			System.out.println(" Queue is Full ");
		else { 
			
			if(front == -1) {
				front++;
				rear++;
				queue[rear]=data;
			} else if (rear == size -1 && front !=0) {
					rear = 0;
					queue[rear]=data;
				}
			else {
				rear++;
				if( front <= rear)
					queue[rear]=data;
			}
		}
	}
	
	private void dequeue() {
		
		// Condition for empty queue.
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
			return;
	    }
	    
	    System.out.println("deleted elemt: " + queue[front] );
	    // Condition for only one element
	    if(front == rear)
	    {
	        front = -1;
	        rear = -1;
	    }
	    
	    else if(front == size - 1)
	    {
	        front = 0;
	    }
	    else
	    {
	        front = front + 1;
	    }
		
	}

	private void show() {
		
		// Condition for empty queue.
	    if(front == -1)
	    {
	        System.out.print("Queue is Empty");
			return;
	    }
	    System.out.println("Elements in the circular queue are: ");
	 
	    if(rear >= front)
	    {
	     
	        // Loop to print elements from front to rear.
	        for(int i = front; i <= rear; i++)
	        {
	            System.out.print(queue[i] + " ");
	        }
	        System.out.println();
	    }
	 
	    // If rear crossed the max index and indexing has started in loop
	    else
	    {
	        // Loop for printing elements from front to max size or last index
	        for(int i = front; i < size; i++)
	        {
	        	System.out.print(queue[i] + " ");
	        }
	 
	        // Loop for printing elements from 0th index till rear position
	        for(int i = 0; i <= rear; i++)
	        {
	        	System.out.print(queue[i] + " ");
	        }
	        System.out.println();
	    }
	    
	}
	
	public static void main(String[] args) {
		
		CircularQueue circularQueue = new CircularQueue();
		circularQueue.enqueue(10);
		circularQueue.enqueue(20);
		circularQueue.enqueue(30);
		circularQueue.enqueue(40);
		circularQueue.enqueue(50);
		circularQueue.show();
		
		System.out.println("Dequeue operation : ");
		circularQueue.dequeue();
		circularQueue.show();
		
		System.out.println("Again trying to insert value in empty position of circular queue :  ");
		circularQueue.enqueue(50);
		circularQueue.show();
		
		circularQueue.enqueue(50);
		circularQueue.show();
		
	}

}
