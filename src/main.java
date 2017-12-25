import DynamicArray.DynamicArray;
import LinkedList.LinkedList;
import LinkedList.Node;
import Stack.StackArray;
import Stack.StackDynamicArray;
import Stack.StackLinkedList;
import Queue.queue;;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue<String> queue = new queue<String>(5);
		
		queue.queue("A");
		queue.queue("B");
		queue.queue("C");
		queue.queue("D");
		queue.queue("E");
		queue.queue("F");

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
	}

}
