package StackMin;



public class MainApp {
	
	public static Integer[] minStac(int[][] input) {//method definition #3
		Integer[] result=new Integer[8];
		MnStack st =  null ;
		for(int i=0;i<input.length;i++) {
			if(i==0) {	
				st=new MnStack();
				result[i]=null;
			}
			if(i==1 || i==2 || i==3) {
				 st.push(input[i][0]);
 			result[i]=null;
			}
			if(i==4 || i==7) {
				int res=st.getMin();
				result[i]=res;
			}
			if(i==5) {
				st.pop();
				result[i]=null;
			}
			if(i==6) {
				result[i]=st.top();
			}	
		}
		return result; 		
    }
    
    
    
    
    
public static void main(String[] args) {
	
	int[][] input= {{},{-2},{0},{-3},{},{},{},{}};//Array intialization #1
	  //method calling #2
    Integer[] result = minStac(input);
         for(int i=0;i<result.length;i++) {
  	    System.out.print(result[i]+" ");
  }
        
	
	MnStack mn=new MnStack();  // escaping above scenario or analysis
	
	mn.push(30);
	mn.push(32);
	mn.push(40);
	mn.push(20);
	mn.display();
	int param1=mn.getMin();
	mn.pop();
	
	int param2= mn.top();
	int param3= mn.getMin();
	System.out.println();
	System.out.println("min: "+param1);
	System.out.println("Top: "+param2);
	System.out.println("min: "+param3);
	
	
		
		

    
	}

}
