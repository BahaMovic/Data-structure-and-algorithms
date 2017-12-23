import DynamicArray.DynamicArray;
import LinkedList.LinkedList;
import LinkedList.Node;
import Stack.StackArray;
import Stack.StackDynamicArray;
import Stack.StackLinkedList;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList sll = new StackLinkedList(new Node<String>(null,"First element"));
		sll.push(new Node<Integer>(null,12));
		sll.push(new Node<Double>(null,1.4));
		sll.display();
		sll.pop();
		System.out.println("\nAfter Deleted");
		sll.display();

	}

}
