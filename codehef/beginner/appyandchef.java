import java.util.*;
public class appyandchef{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){            
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            for (int i = 1; i <=n; i++){
                if(i%a == 0 && i%b != 0){
                    count++;
                }
                else if(i%b == 0 && i%a != 0){
                    count++;
                }  
                System.out.println(count + "");              
            }
            if(count >= k){
                System.out.println("Win");
            }
            else    
                System.out.println("Loose");
        }
    }
}
