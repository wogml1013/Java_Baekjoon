import java.util.*;
import java.io.*;
public class J_11051 {
 
    static int[][] arr;
 
    public static void main(String[] args) throws IOException{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        arr = new int[1001][1001];
        arr[1][0] = arr[1][1] = 1;
 
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if(i == j || j == 0)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                
                arr[i][j] %=10007;
            }
        }
        System.out.println(arr[n][r]);
    }
}