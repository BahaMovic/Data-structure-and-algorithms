package LinkedList;

public class LinkedList {

	Node head;
	public LinkedList(Node head) {
		this.head = head;
	}
	
	public void add(Node node)
	{
		node.next = head;
		head = node;
	}
	
	public void delete()
	{
		head = head.next;
	}
	
	public void display()
	{
		Node node = head;
		
		while(node != null)
		{
			System.out.println(node.value);
			node = node.next;
		}
	}

}
