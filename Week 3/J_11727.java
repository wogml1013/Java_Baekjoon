import java.io.*;
import java.util.*;

public class J_11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];

        arr[0] = arr[1] = 1;
        for (int i = 2; i < n+1; i++){
            arr[i] = (arr[i-1] + 2*arr[i-2]) % 10007;
        }

        System.out.println(arr[n]);
    }
}   