import java.util.*;
public class maximize{
    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);        
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int arr[] = new int[n + 1];
            int sum = 0;
            for (int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
                sum += Math.abs(arr[i]);
            } 
            System.out.println(sum + "");
        }
    }
}