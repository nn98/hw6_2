package hw6_2;

public class MyDoublyLinkedList {
	public class Node {
		int data;
		Node llink=null;
		Node rlink=null;
		public Node(int data) {
			this.data=data;
		}
	}
	private Node head=null;

	public void addFirst(int add) {
		Node n=new Node(add);
		n.rlink=head;
		if(n.rlink!=null) 
			n.rlink.llink=n;
		head=n;
	}
	@Override
	public String toString() {
		Node n=head;
		String s="";
		while(n!=null) {
			s=s+Integer.toString(n.data)+" ";
			n=n.rlink;
		}
		return s;
	}
	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			System.out.print("( ");
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.rlink;
			}
			System.out.print(") ");

			System.out.print("( ");
			temp=head;
			while(temp.rlink!=null) {
				temp=temp.rlink;
			}
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.llink;
			}
			System.out.print(")\n");
		}
	}
	public int size() {
		int s=0;
		Node n=head;
		while(n!=null) {
			s++;
			n=n.rlink;
		}
		return s;
	}
	public void addLast(int data) {
		Node c=new Node(data);
		Node n=head;
		while(n.rlink!=null) {
			n=n.rlink;
		}
		n.rlink=c;
		c.llink=n;
		n=c;
	}
	public int removeFirst() {
		Node n=head;
		head=n.rlink;
		return n.data;
	}
	public int removeLast() {
		Node n=head;
		Node d=n;
		while(n.rlink!=null) {
			d=n;
			n=n.rlink;
		}
		int r=n.data;
		d.rlink=null;
		return r;
	}
	public boolean remove(int i) {
		Node n=head;
		while (n!=null) {
			if (n.data==i&&n.rlink==null&&n.llink==null) {
				head=null;
				return true;
			} else if (n.data==i) {
				n.llink.rlink=n.rlink;
				if(n.rlink!=null)
					n.rlink.llink=n.llink;
				return true;
			} else n=n.rlink;
		}
		return false;
	}
}
