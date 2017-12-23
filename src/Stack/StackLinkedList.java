package Stack;

import LinkedList.Node;

public class StackLinkedList {

	Node head;
	public StackLinkedList(Node head) {
		// TODO Auto-generated constructor stub
		this.head = head;
	}
	
	public void push(Node node)
	{
		node.next = head;
		head = node;
	}
	
	public void pop()
	{
		head = head.next;
	}
	
	public void display()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.value);
			n = n.next;
		}
	}

}
