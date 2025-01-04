package programming;

//import programming.LL.Node;

public class ReverseLL {
	Node head;
	int size;
	
	ReverseLL(){
		this.size=0;
	}
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data= data;
			this.next= null;
			size++;
		}
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
