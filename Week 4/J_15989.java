import java.util.*;
import java.io.*;

public class J_15989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T, n;
        int[][] arr;
        T = Integer.parseInt(br.readLine());

        for (; T > 0; T--){
            arr = new int[10001][3];
            arr[1][0] = 1;
            arr[1][1] = 0;
            arr[1][2] = 0;

            arr[2][0] = 1;
            arr[2][1] = 1;
            arr[2][2] = 0;
            
            arr[3][0] = 1;
            arr[3][1] = 1;
            arr[3][2] = 1;
            n = Integer.parseInt(br.readLine());
            if (n > 3){
                for (int i = 4; i <= n; i++){
                    arr[i][0] = 1;
                    arr[i][1] = arr[i-2][0] + arr[i-2][1];
                    arr[i][2] = arr[i-3][0] + arr[i-3][1] + arr[i-3][2];
                }
                System.out.println(arr[n][0]+arr[n][1] + arr[n][2]);
            }
            else {
                System.out.println(arr[n][0]+arr[n][1] + arr[n][2]);
            }
        }
    }

}
