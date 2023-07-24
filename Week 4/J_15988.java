import java.util.*;
import java.io.*;

public class J_15988 {
    public static void main(String[] args) throws IOException {
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        long[] arr = new long[1000001];
        arr[0] = 1;
    
        for (int i = 1; i <= 1000000; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i >= j) {
                    arr[i] = (arr[i] + arr[i - j]) % 1000000009;
                }
            }
        }
        for (; T > 0; T--){
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
        }
    }
}
