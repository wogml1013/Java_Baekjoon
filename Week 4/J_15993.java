import java.util.*;
import java.io.*;

public class J_15993 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T, n;
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());
        long[][] arr;
        arr = new long[1000001][2];
        arr[1][0] = 1;
        arr[1][1] = 0;
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[3][0] = 2;
        arr[3][1] = 2;

        for (int i = 4; i <= 100000; i++){
            arr[i][0] = arr[i-1][1]%1000000009 + arr[i-2][1]%1000000009 + arr[i-3][1]%1000000009;
            arr[i][1] = arr[i-1][0]%1000000009 + arr[i-2][0]%1000000009 + arr[i-3][0]%1000000009;
        }
        
        for (; T > 0; T--){
            n = Integer.parseInt(br.readLine());
            long odd = arr[n][0] % 1000000009;
            long even = arr[n][1] % 1000000009; 
            System.out.println(odd+" "+even);
        }
    }
}

