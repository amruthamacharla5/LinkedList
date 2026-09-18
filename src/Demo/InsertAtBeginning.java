package Demo;

public class InsertAtBeginning {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	Node head = null;
	void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	void display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		InsertAtBeginning list = new InsertAtBeginning();
		list.insertAtBeginning(30);
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);
		list.insertAtBeginning(5);
		list.display();
	}

}
   