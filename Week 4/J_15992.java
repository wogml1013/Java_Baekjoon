import java.util.*;
import java.io.*;

public class J_15992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T, n, m;
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());
        long[][] arr = new long[1001][1001];
        arr[1][1] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;
        arr[3][1] = 1;
        arr[3][2] = 2;
        arr[3][3] = 1;
        for (int i = 4; i <= 1000; i++){
            for (int j = 2; j <= 1000; j++){
                arr[i][j] = arr[i-3][j-1]%1000000009 + arr[i-2][j-1]%1000000009 + arr[i-1][j-1]%1000000009;   
            }
        }
        for (; T > 0; T--){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            
            System.out.println(arr[n][m] % 1000000009);
        }
    }
}

