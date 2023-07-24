import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class J_11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N, K;
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] valueArr = new int[N];

        for (int i = 0; i < N; i++){
            valueArr[i] = Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        for (int j = N-1; j >= 0 && K != 0; j--){
            if (K / valueArr[j] >= 1){
                cnt += K / valueArr[j];
                K = K % valueArr[j];
            }
        }
        System.out.println(cnt);
    }
}
