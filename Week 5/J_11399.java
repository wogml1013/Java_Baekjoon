import java.util.*;
import java.io.*;

public class J_11399 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] tc = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            tc[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tc);
        int[] dp = new int[N];
        dp[0] = tc[0];
        int res = tc[0];
        for (int j = 1; j < N; j++){
            dp[j] = dp[j-1] + tc[j];
            res += dp[j];
        }
        System.out.println(res);
    }    
}
