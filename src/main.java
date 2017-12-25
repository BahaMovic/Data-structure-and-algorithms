import DynamicArray.DynamicArray;
import LinkedList.LinkedList;
import LinkedList.Node;
import Stack.StackArray;
import Stack.StackDynamicArray;
import Stack.StackLinkedList;
import Queue.NodeDouble;
import Queue.QueueLinkedList;
import Queue.queue;;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList qll = new QueueLinkedList<String>(new NodeDouble<Integer>(4,null,null));
		
		qll.queue(new NodeDouble<String>("Hello World",null,null));
		qll.queue(new NodeDouble<Double>(12.9,null,null));
		
		System.out.println(qll.dequeue());
		System.out.println(qll.dequeue());
		
	}

}
