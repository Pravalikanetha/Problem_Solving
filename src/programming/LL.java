package programming;

//import programming.ReverseLL.Node;

public class LL {
	Node head;
	private int size;
	
	LL(){
		this.size=0;
	}
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
			this.next= null;
			size++;
		}
	}
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next !=null) {
			currNode = currNode.next;
		}
		currNode.next= newNode;
	}
	
	public void print() {
		if(head==null) {
			System.out.print("no node");
		}
		Node currNode = head;
		while(currNode !=null) {
			System.out.print(currNode.data +"->");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.print("no node");
			return;
		}
		size--;
		head = head.next;
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.print("no node");
			return;
		}
		size--;
		if(head.next == null) {
			head= null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode= lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next= null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void reverseIterate() {
		
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next= prevNode;
			
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next=null;
		head= prevNode;
	}

	public Node reverseRecursive(Node head) {
		if(head == null || head.next==null) {
			return head;
		}
		Node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	public static void main(String[] args) {
		LL list = new LL();
		
		list.addLast(3);
		list.addLast(4);
		list.addLast(5);
		list.print();
		list.addFirst(2);
		list.addFirst(1);
		//list.print();
		//list.deleteFirst();
		//list.print();
		//list.deleteLast();
		list.print();
		//System.out.println(list.getSize());
		//list.reverseIterate();
		//list.print();
		list.head=list.reverseRecursive(list.head);
		list.print();
	}

}
