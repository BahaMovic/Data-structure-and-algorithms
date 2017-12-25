package Queue;

public class queue<T>{

	Object[] array;
	int rear;
	int front;
	int size;
	public queue(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.array = new Object[this.size];
		front =0;
		rear = -1;
	}
	
	public void  queue(Object item)
	{
		if(rear >= size-1)
		{
			System.out.println("array is full");
		}
		else
		{
			rear += 1;
			this.array[rear] = item;
			
		}
	}
	
	public T dequeue()
	{
		if(front>= size-1)
		{
			//System.out.println("array is empaty");
			return (T) "array is empaty";
		}
		else
		{
		Object ob = this.array[front];
		front +=1;
		return (T) ob;
		}
	}

}
