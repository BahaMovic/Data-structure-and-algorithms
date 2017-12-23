package DynamicArray;

import java.util.Arrays;

public class DynamicArray<T>{

	private int size;
	private Object[] data;
	public DynamicArray() {
		// TODO Auto-generated constructor stub
		size = 0;
		data = new Object[1];
	}
	
	public T getIndex(int index)
	{
		return (T) data[index];
	}
	
	public void add(int element)
	{
		ensureCapacity(size);
		data[size] = element;
		
		size++;
		
	}
	
	public void ensureCapacity(int minCapacity)
	{
		int oldCapacity = data.length;
		
		if(oldCapacity<=minCapacity)
		{
			int newCapacity = oldCapacity*2;
			data = Arrays.copyOf(data, newCapacity);
		
		}
	}

}
