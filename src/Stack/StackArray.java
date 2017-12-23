package Stack;

public class StackArray <T> {
	int size;
	Object[] Array;
	int top ;
	public StackArray(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		Array = new Object[this.size];
		top = 0;
	}
	
	public void push(T element)
	{
		if(top < size)
		{
			Array[top]=element;
			top++;
		}
	}
	
	public void pop()
	{
		if(top > -1)
		{
			
			System.out.println("Deleted"+Array[top-1]);
			top --;
			
		}
		else
		{
			System.out.println("Array is empaty");
		}
	}
	
	public void display()
	{
		for(int i = 0 ; i < top ; i++)
		{
			System.out.println(Array[i]);
		}
	}

}
