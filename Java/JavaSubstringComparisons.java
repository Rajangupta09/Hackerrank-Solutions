import java.util.Scanner;
public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for (int i = 0; i <= s.length() - k; i++) {
            String tmp = s.substring(i, k + i);
            if(smallest.compareto(tmp) >0){
                smallest = tmp;
            }
            if(largest.compareto(tmp)<0){
                largest = tmp;
            }
		}
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}