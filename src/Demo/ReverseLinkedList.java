package Demo;

public class ReverseLinkedList {
	static class Node{
		int data;
		Node Next;
		Node(int data){
			this.data = data;
		}
		
	}
	Node head;
	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.Next != null) {
			current = current.Next;
			
		}
		current.Next = newNode;
	}
	void reverse() {
		Node previous = null;
		Node current = head;
		while(current != null) {
			Node nextNode = current.Next;
			current.Next = previous;
			previous = current;
			current = nextNode;
			
		}
		head = previous;
	}
	void display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.Next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		System.out.println("Original:");
		list.display();
		list.reverse();
		System.out.println("Reversed:");
		list.display();
		
	}

}
