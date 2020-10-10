import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }
        char a1[] = a.toLowerCase().toCharArray();
        char b1[] = b.toLowerCase().toCharArray();
        int arr[] = new int[256]; 
        for(int i=0;i<256;i++){
            arr[i] = 0;
        }

        for(int i=0;i<a.length();i++){
            arr[a1[i]]++;
            arr[b1[i]]--;
        }
        for(int i=0;i<256;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
         
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
