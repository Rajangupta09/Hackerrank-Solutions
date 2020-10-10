import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int len = A.length() > B.length() ? B.length() : A.length();
        String temp = "";
        for(int i=0;i<len;i++){
            if((int)(A.toLowerCase()).charAt(i)>(int)(B.toLowerCase().charAt(i))){
                temp = "Yes";
                break;
            }
            else if((int)(A.toLowerCase()).charAt(i)<(int)(B.toLowerCase().charAt(i))){
                temp = "No";
                break;
            }
        }
        if (temp == "") {
            if (A.length() > B.length()) {
                temp = "Yes";
            } else {
                temp = "No";
            }
        }
        System.out.println(temp);
        System.out.println((A.toUpperCase()).charAt(0) + A.substring(1, A.length()) + " " + (B.toUpperCase()).charAt(0) + B.substring(1, B.length()));
    
    }
}



