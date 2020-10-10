import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String s;
            
            if(n>=2 && isPrime(n)){
                s = "Prime";
            }
            else{
                s  = "Not prime";
            }
            System.out.println(s);
        }
        }
    }

