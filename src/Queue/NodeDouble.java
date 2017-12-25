package Queue;

public class NodeDouble<T>{

	NodeDouble previous;
	NodeDouble next;
	T value;
	public NodeDouble(T value ,NodeDouble previous,NodeDouble next) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.previous = previous;
		this.next = next;
	}

}
