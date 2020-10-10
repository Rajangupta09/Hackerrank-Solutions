//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> hsmap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hsmap.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (hsmap.containsKey(s)) {
                System.out.println(s + "=" + hsmap.get(s));

            } else {
                System.out.println("Not found");
            }

        }
        in.close();
    }
}