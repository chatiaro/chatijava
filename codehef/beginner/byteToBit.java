import java.util.*;
public class byteToBit{
    public static void main(String[] args) {
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int[] v = {1, 0, 0};
            int n = sc.nextInt();
            for (int i = 3; i <= n; i++){
                int d = i % 26;
                if (d == 3){
                    v[1] = v[0];
                    v[0] = 0;
                }
                else if(d == 11){
                    v[2] = v[1];
                    v[1] = 0;
                }
                else if(d == 1){
                    v[0] = v[2] * 2;
                    v[2] = 0;
                }
            }
            for (int i = 0; i < 3; i++){
                System.out.print(v[i]);
                System.out.print(" ");
            }
        }           
    }
}