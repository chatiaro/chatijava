import java.util.*;
public class deputyChef{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int nos = sc.nextInt();
            int a[] = new int[nos + 3];
            int d[] = new int[nos + 3];            
            for (int i = 1; i <nos + 1; i++){
                a[i] = sc.nextInt();
            }
            for (int i = 1; i < nos + 1; i++){
                System.out.println("meh");
                d[i] = sc.nextInt();
            }
            a[0] = a[nos] ;
            a[nos+1] = a[0];
            int ans = -1;
            for(int i = 1; i < nos+1; i++){
                if(a[i-1] + a[i+1] < d[i]){
                    ans = Math.max(ans, d[i]);
                }
            }
            System.out.println(ans + "");
        }
    }
}