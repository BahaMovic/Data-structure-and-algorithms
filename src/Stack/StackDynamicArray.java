package Stack;

import java.util.Arrays;

public class StackDynamicArray<T>{
	int size;
	Object[] DA;
	public StackDynamicArray() {
		// TODO Auto-generated constructor stub
		size = 0;
		DA = new Object[1];
	}
	
	public void push(T element)
	{
		if(size >= DA.length)
		{
			DA = Arrays.copyOf(DA, DA.length*2);
			DA[size]=element;
			size++;
		}
		else
		{
			DA[size] = element;
			size++;
		}
	}
	
	public void pop()
	{
		System.out.println("Delete "+DA[size-1]);
		size--;
	}
	
	public void display()
	{
		for(int i = 0 ; i < size ; i++) {
			System.out.println(DA[i]);
		}
	}

}
