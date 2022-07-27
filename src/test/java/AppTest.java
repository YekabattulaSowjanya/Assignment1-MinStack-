import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Test;

import Stack.MinStack;
import StackMin.MnStack;



public class AppTest {
	//private static final Object  = null;
	MnStack minStack = new MnStack();
	
	
	
	@Test	
		 //@DisplayName("Minmum")
	public void when_StackHasElements_Expect_TopEleToBeRemovedForPop() {
			
			 minStack.push(-2);
			    minStack.push(0);
			    minStack.push(-3);
			    minStack.push(10);
			          
			    
			   minStack.getMin();
			   assertEquals(-3,minStack.getMin()); 
				
			    //minStack.pop();
			 
		        //assertEquals(10,minStack.top());
		
			    
			   // minStack.getMin();
			    //assertEquals(-3,minStack.getMin());
				
	} 
	
	@Test (expected = EmptyStackException.class)
	
	public void When_StackHasNoEle_Expect_EmptyException() {
		
		minStack.push(2);
		minStack.push(20);
		minStack.pop();
		minStack.pop();
		
		minStack.getMin();
	} 

 
}




