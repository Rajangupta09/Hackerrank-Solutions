import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l = 0;
        int r = A.length() -1;
        String str = "Yes";
        while(l<r){
            if(A.charAt(l) != A.charAt(r)){
                str = "No";
                break;
            }
            l+=1;r-=1;
        }
        System.out.println(str);
        
    }
}



