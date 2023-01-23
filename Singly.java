public class Singly {


  
	Node head;
	Node tail;
	
	private static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	
public void addEnd(int x) {
	Node p = new Node(x);
	if (head == null) {
		head = tail = p;
	}else {
		tail.next = p;
		tail = p;
	}
	
}

public void addFirst(int x) {
	Node P = new Node(x);
	if (head == null) {
		head = tail = P;
	}else {
		P.next = head;
		head = P;
	}
}

	
	public void display() {
		Node p  =  head;
		while (p != null ) {
			System.out.print(p.data+" -> ");
			p = p.next;
		}
		System.out.println();
	}
	
	private int length() {
		Node p = head;
		int count = 0;
		while (p != null) {
			count++;
			p = p.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Singly sl = new Singly();
		sl.addEnd(10);
		sl.addEnd(20);
		
		sl.display();
		sl.addEnd(30);
		sl.addFirst(555);
		sl.display();
		
		System.out.println("length = "+sl.length());
		
		
	}
	
	
}


