import DynamicArray.DynamicArray;
import LinkedList.LinkedList;
import LinkedList.Node;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls = new LinkedList(new Node<String>(null,"first element"));
		ls.add(new Node<String>(null,"Second Element"));
		ls.add(new Node<Integer>(null,12));
		ls.display();
		
		System.out.println("\nafter delete");
		ls.delete();
		ls.display();

	}

}
