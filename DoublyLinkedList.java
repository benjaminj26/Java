package Lab21;

import java.util.Scanner;

class Implementation {
	
	 class Node{  

	        int item;  

	        Node previous;  

	        Node next;  

	         public Node(int item) {  

	            this.item = item;  

	        }  

	    }  

	    //Initially, head and tail is set to null

	    Node head = null, tail = null;  

	   

	    //add a node to the list  

	    public void addNode(int item) {  

	        //Create a new node  

	        Node newNode = new Node(item);  

	        //if list is empty, head and tail points to newNode  

	        if(head == null) {  

	            head = tail = newNode;  

	            //head's previous will be null  

	            head.previous = null;  

	            //tail's next will be null  

	            tail.next = null;  

	        }  

	        else {  

	            //add newNode to the end of list. tail->next set to newNode  

	            tail.next = newNode;  

	            //newNode->previous set to tail  

	            newNode.previous = tail;  

	            //newNode becomes new tail  

	            tail = newNode;  

	            //tail's next point to null  

	            tail.next = null;  

	        }  

	    }  

	    public void deleteNodes() {

	    	if(head == null) {
	    		System.out.println("The list is empty");
	    	}
	    	else {
	    		int x = head.item;

	    		head = head.next;

	    		System.out.println("Element "+x +" got deleted");
	    	}

	   }

	//print all the nodes of doubly linked list  

	    public void printNodes() {  

	        //Node current will point to head  

	    	if(head == null) {  
	    		
	    		System.out.println("Doubly linked list is empty");  
	    		
	    		return;  
	    		
	    	}  
	    	
	    	else { 
	    		Node current = head;  


	    		System.out.println("Nodes of doubly linked list: ");  

	        	while(current != null) {  

	        		//Print each node and then go to next.  

	        		System.out.print(current.item + " ");  

	            	current = current.next;  

	        	}
	    	}

	    }
}

public class DoublyLinkedList {
	public static void main(String[] args) {
		Implementation list = new Implementation();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n1.Add Node");
			System.out.println("2.Delete Node");
			System.out.println("3.Print Nodes");
			System.out.println("4.Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1: 
					System.out.print("Enter the element to inserted: ");
					int element = sc.nextInt();
					list.addNode(element);
					break;
				case 2:
					list.deleteNodes();
					break;
				case 3: 
					list.printNodes();
					break;
				case 4:
					sc.close();
					System.exit(0);
			}
		}while(true);
		
	}
}
