package StackMin;

import java.util.EmptyStackException;
import java.util.Stack;

import StackMin.MnStack;

public class MnStack {
	
	public int size;

	Stack<Integer> st =new Stack<Integer>();
	int min = Integer.MAX_VALUE; 
	int premin = Integer.MAX_VALUE;
	
	public void push(int x) {
		st.push(x);
		premin = min;
		min=Math.min(min, x);
	}
	
	public void pop() {
		if(st.peek()==min)
		{
			                             //throw new EmptyStackException();
		                                //}else{
			min=premin;
		}
		st.pop();
	}
	public int top() {
		return st.peek();      //get(st.size()-1); 
	}
	 public int getMin() {
		if(st.isEmpty()) {
			 throw new EmptyStackException();
		}
		return min;
		
	}
	 
	 
	
	void display() {
		for(int i=st.size()-1;i>=0;i--) {
			
		System.out.println(st.get(i));	
			
		}
		
	}
	
 
}