// Assignment:  1. Explore the labels with break and continue in Loops :)
package assignment.com;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//label using Break Statement and Continue
      int end=10;
      int cont = 5;
      ending:
      for(int i=0;i<15;i++) {
    	  if(i==end) {
    		  break ending;
    	  }
    	  else if(i==cont) {
    		  System.out.println(" Skipped: "+i+" Continuing from "+(i+1));
    		  continue ending;
    	  }
    	  System.out.print(i);
      }
      
	}

}
