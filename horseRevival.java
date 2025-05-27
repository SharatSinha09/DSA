import java.util.*;
public class horseRevival {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int i=0;
            int cnt = 0;
            int op = 0;
            while(i < n){
                if(s.charAt(i) == '0'){
                    cnt++;
                    if(cnt == m){
                        op++;
                        cnt=0;
                        i=i+k-1;
                    }
                }else{
                    cnt = 0;
                }
                i++;
            }
            System.out.println(op);
        }
        sc.close();
    }
}
