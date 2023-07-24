import java.util.*;
import java.io.*;

public class J_1912 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[] cost = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}
        arr[1] = cost[1];
        for (int i = 2; i <= n; i++){
            arr[i] = Math.max(arr[i-1]+cost[i], cost[i]);
        }
        int max = arr[1];
        for (int i = 1; i <= n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
