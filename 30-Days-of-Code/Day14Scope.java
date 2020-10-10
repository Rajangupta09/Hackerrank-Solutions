import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    Difference(int [] elements){
        this.elements=elements;
    }
    
    void computeDifference() {
        int maxNum = elements[0];
        int minNum = maxNum;
        for (int i = 1; i < elements.length; i++) {
            
            maxNum=elements[i]>maxNum?elements[i]:maxNum;
            minNum=elements[i]>minNum?minNum:elements[i];
            
        }
        maximumDifference=Math.abs(maxNum-minNum);
    }
	// Add your code here

} // End of Difference class