package Queue;

public class QueueLinkedList<T> {

	NodeDouble<T> Rear;
	NodeDouble<T> Front;
	public QueueLinkedList(NodeDouble Rear) {
		// TODO Auto-generated constructor stub
		this.Rear = Rear;
		this.Front = Rear;
	}
	
	public void queue(NodeDouble nd)
	{
		nd.previous = Rear;
		Rear.next = nd;
		Rear = nd;
	}
	
	public T dequeue()
	{
		T value = (T) Front.value;
		Front = Front.next;
		Front.previous = null;
		return value;
	}

}
