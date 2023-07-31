import java.io.*;
import java.util.*;

public class J_16112 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        
        int act = 0;
        act++;
        long exp = 0;
        for (int j = 1; j < N; j++){
            if (act < K){
                exp += arr[j] * act++;
                
            }
            else { 
                exp += arr[j] * act;
            }
        }
        System.out.println(exp);
    }
}
